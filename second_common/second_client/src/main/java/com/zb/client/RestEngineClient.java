package com.zb.client;
import com.zb.pojo.Engine;

import com.zb.fallback.EngineClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = EngineClientFallBack.class)
public interface RestEngineClient {
@RequestMapping(value = "/getEngineById",method = RequestMethod.POST)
public Engine getEngineById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getEngineListByMap",method = RequestMethod.POST)
public List<Engine>	getEngineListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getEngineCountByMap",method = RequestMethod.POST)
public Integer getEngineCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddEngine",method = RequestMethod.POST)
public Integer qdtxAddEngine(@RequestBody Engine engine)throws Exception;

@RequestMapping(value = "/qdtxModifyEngine",method = RequestMethod.POST)
public Integer qdtxModifyEngine(@RequestBody Engine engine)throws Exception;
}

