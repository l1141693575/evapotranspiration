package com.zb.fallback;

import com.zb.pojo.Easily;

import com.zb.client.RestEasilyClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class EasilyClientFallBack implements RestEasilyClient {


    @Override
    public Easily getEasilyById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Easily>	getEasilyListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getEasilyCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddEasily(Easily easily)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyEasily(Easily easily)throws Exception{
        return null;
    }
}
