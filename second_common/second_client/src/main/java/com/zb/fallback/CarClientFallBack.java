package com.zb.fallback;

import com.zb.pojo.Car;

import com.zb.client.RestCarClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class CarClientFallBack implements RestCarClient {


    @Override
    public Car getCarById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Car>	getCarListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getCarCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddCar(Car car)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyCar(Car car)throws Exception{
        return null;
    }
}
