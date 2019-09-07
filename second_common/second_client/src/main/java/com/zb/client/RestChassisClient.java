package com.zb.client;
import com.zb.pojo.Chassis;

import com.zb.fallback.ChassisClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = ChassisClientFallBack.class)
public interface RestChassisClient {
@RequestMapping(value = "/getChassisById",method = RequestMethod.POST)
public Chassis getChassisById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getChassisListByMap",method = RequestMethod.POST)
public List<Chassis>	getChassisListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getChassisCountByMap",method = RequestMethod.POST)
public Integer getChassisCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddChassis",method = RequestMethod.POST)
public Integer qdtxAddChassis(@RequestBody Chassis chassis)throws Exception;

@RequestMapping(value = "/qdtxModifyChassis",method = RequestMethod.POST)
public Integer qdtxModifyChassis(@RequestBody Chassis chassis)throws Exception;
}

