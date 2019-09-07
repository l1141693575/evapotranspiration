package com.zb.client;
import com.zb.pojo.Car;

import com.zb.fallback.CarClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = CarClientFallBack.class)
public interface RestCarClient {
@RequestMapping(value = "/getCarById",method = RequestMethod.POST)
public Car getCarById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getCarListByMap",method = RequestMethod.POST)
public List<Car>	getCarListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getCarCountByMap",method = RequestMethod.POST)
public Integer getCarCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddCar",method = RequestMethod.POST)
public Integer qdtxAddCar(@RequestBody Car car)throws Exception;

@RequestMapping(value = "/qdtxModifyCar",method = RequestMethod.POST)
public Integer qdtxModifyCar(@RequestBody Car car)throws Exception;
}

