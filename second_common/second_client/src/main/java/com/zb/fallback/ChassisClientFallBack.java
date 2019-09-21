package com.zb.fallback;

import com.zb.pojo.Chassis;

import com.zb.client.RestChassisClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ChassisClientFallBack implements RestChassisClient {


    @Override
    public Chassis getChassisById(Integer id)throws Exception{
        return null;
    }

    @Override
    public List<Chassis>	getChassisListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getChassisCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddChassis(Chassis chassis)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyChassis(Chassis chassis)throws Exception{
        return null;
    }
}
