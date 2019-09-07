package com.zb.fallback;

import com.zb.pojo.Great;

import com.zb.client.RestGreatClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class GreatClientFallBack implements RestGreatClient {


    @Override
    public Great getGreatById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Great>	getGreatListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getGreatCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddGreat(Great great)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyGreat(Great great)throws Exception{
        return null;
    }
}
