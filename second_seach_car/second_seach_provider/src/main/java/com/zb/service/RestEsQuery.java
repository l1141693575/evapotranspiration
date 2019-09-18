package com.zb.service;

import com.zb.EsQuery;
import com.zb.pojo.Car;
import org.apache.ibatis.annotations.Param;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RestEsQuery implements EsQuery {

    @Autowired
    private RestHighLevelClient restHighLevelClient;


    @RequestMapping(value = "/getesquery")
    @Override
    public List<Car> queryManyBetweenMatch(@RequestParam(required = false) Map<String, Object> map) throws IOException {
        List<Car> list = new ArrayList<>();
        SearchRequest searchRequest = new SearchRequest("second");
        searchRequest.types("doc");
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        //bool查询对象
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        //品牌精确查询
        TermQueryBuilder brand = null;
        //严选车cstrict  急出售cshort 超值coverflow 练手车cpractice精确查询
        TermQueryBuilder cstrict=null;
        TermQueryBuilder cshort=null;
        TermQueryBuilder coverflow=null;
        TermQueryBuilder cpractice=null;

        //车系精确查询
        TermQueryBuilder series = null;
        //区间查询
        RangeQueryBuilder price = null;
        //是否卖出精确查询
        TermQueryBuilder cstate = null;
        //只查询出未卖出的车辆
        cstate = QueryBuilders.termQuery("cstate", 0);
         boolQueryBuilder.must(cstate);

         if (map.get("bid") != null && !map.get("bid").equals("")) {
            brand = QueryBuilders.termQuery("bid", map.get("bid"));
            boolQueryBuilder.must(brand);
        }
        if (map.get("sid") != null && !map.get("sid").equals("")) {
            series = QueryBuilders.termQuery("sid", map.get("sid"));
            boolQueryBuilder.must(series);
        }
        if (map.get("cprice") != null && !map.get("cprice").equals("")) {
            String cprice = map.get("cprice").toString();
            String[] split = cprice.split(",");
            System.out.println(split[0] + "\t" + split[1]);
            price = QueryBuilders.rangeQuery("cprice").gte(split[0]).lte(split[1]);
            boolQueryBuilder.must(price);
        }

        //严选车cstrict  急出售cshort 超值coverflow 练手车cpractice
        if (map.get("cstrict") != null && !map.get("cstrict").equals("")) {
            cstrict = QueryBuilders.termQuery("cstrict", map.get("cstrict"));
            boolQueryBuilder.must(cstrict);
        }
        if (map.get("cshort") != null && !map.get("cshort").equals("")) {
            cshort = QueryBuilders.termQuery("cshort", map.get("cshort"));
            boolQueryBuilder.must(cshort);
        }
        if (map.get("coverflow") != null && !map.get("coverflow").equals("")) {
            coverflow = QueryBuilders.termQuery("coverflow", map.get("coverflow"));
            boolQueryBuilder.must(coverflow);
        }
        if (map.get("cpractice") != null && !map.get("cpractice").equals("")) {
            cpractice = QueryBuilders.termQuery("cpractice", map.get("cpractice"));
            boolQueryBuilder.must(cpractice);
        }


        //     MultiMatchQueryBuilder multiMatchQueryBuilder = QueryBuilders.multiMatchQuery(map.get("sname"),"sname","eidentity");


        //  multiMatchQueryBuilder.field("sname",20);


            searchSourceBuilder.query(boolQueryBuilder);


//分页查询，设置起始下标，从0开始
        searchSourceBuilder.from(0);
//每页显示个数
        searchSourceBuilder.size(12);

        searchSourceBuilder.fetchSource(new String[]{"bid", "sid", "cstate","cprice", "eidentity", "cid", "cage", "cmileage"}, new String[]{});
        searchRequest.source(searchSourceBuilder);
        SearchResponse searchResponse = restHighLevelClient.search(searchRequest);
        SearchHits hits = searchResponse.getHits();
        SearchHit[] searchHits = hits.getHits();
        for (SearchHit hit : searchHits) {
            String type = hit.getType();
            String id = hit.getId();

            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
            String bid = sourceAsMap.get("bid").toString();
              String cage = sourceAsMap.get("cage").toString();
            String eidentity = sourceAsMap.get("eidentity").toString();
           String cmileage = sourceAsMap.get("cmileage").toString();
           String cprice = sourceAsMap.get("cprice").toString();
            String sid = sourceAsMap.get("sid").toString();
            String cid = sourceAsMap.get("cid").toString();
            String cstatee = sourceAsMap.get("cstate").toString();
            System.out.println(bid + "\t" + sid + "\t" + cprice);
            Car car = new Car();
            car.setCage(Integer.parseInt(cage));
            car.setCid(Integer.parseInt(cid));
            car.setCmileage(Double.parseDouble(cmileage));
            car.setCprice(Double.parseDouble(cprice));
            car.setBid(Integer.parseInt(bid));
            car.setEidentity(eidentity);
            car.setCsid(Integer.parseInt(sid));
            car.setCstate(Integer.parseInt(cstatee));
            list.add(car);
        }
        return list;
    }
}
