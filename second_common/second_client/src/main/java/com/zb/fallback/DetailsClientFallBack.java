package com.zb.fallback;

import com.zb.pojo.Details;

import com.zb.client.RestDetailsClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class DetailsClientFallBack implements RestDetailsClient {


    @Override
    public Details getDetailsById(Integer id)throws Exception{
        return null;
    }

    @Override
    public List<Details>	getDetailsListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDetailsCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDetails(Details details)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDetails(Details details)throws Exception{
        return null;
    }
}
