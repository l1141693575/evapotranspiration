package com.zb.fallback;

import com.zb.pojo.Engine;

import com.zb.client.RestEngineClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class EngineClientFallBack implements RestEngineClient {


    @Override
    public Engine getEngineById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Engine>	getEngineListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getEngineCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddEngine(Engine engine)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyEngine(Engine engine)throws Exception{
        return null;
    }
}
