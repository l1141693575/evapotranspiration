package com.zb.client;
import com.zb.pojo.Series;

import com.zb.fallback.SeriesClientFallBack;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by shang-pc on 2018/5/15.
*/
@FeignClient(name = "mycloud-order-provider", fallback = SeriesClientFallBack.class)
public interface RestSeriesClient {
@RequestMapping(value = "/getSeriesById",method = RequestMethod.POST)
public Series getSeriesById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getSeriesListByMap",method = RequestMethod.POST)
public List<Series>	getSeriesListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getSeriesCountByMap",method = RequestMethod.POST)
public Integer getSeriesCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddSeries",method = RequestMethod.POST)
public Integer qdtxAddSeries(@RequestBody Series series)throws Exception;

@RequestMapping(value = "/qdtxModifySeries",method = RequestMethod.POST)
public Integer qdtxModifySeries(@RequestBody Series series)throws Exception;
}

