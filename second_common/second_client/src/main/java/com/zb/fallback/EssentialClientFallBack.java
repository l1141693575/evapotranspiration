package com.zb.fallback;

import com.zb.pojo.Essential;

import com.zb.client.RestEssentialClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class EssentialClientFallBack implements RestEssentialClient {


    @Override
    public Essential getEssentialById(Integer id)throws Exception{
        return null;
    }

    @Override
    public List<Essential>	getEssentialListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getEssentialCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddEssential(Essential essential)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyEssential(Essential essential)throws Exception{
        return null;
    }
}
