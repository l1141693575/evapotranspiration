package com.zb.client;
import com.zb.pojo.Easily;

import com.zb.fallback.EasilyClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = EasilyClientFallBack.class)
public interface RestEasilyClient {
@RequestMapping(value = "/getEasilyById",method = RequestMethod.POST)
public Easily getEasilyById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getEasilyListByMap",method = RequestMethod.POST)
public List<Easily>	getEasilyListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getEasilyCountByMap",method = RequestMethod.POST)
public Integer getEasilyCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddEasily",method = RequestMethod.POST)
public Integer qdtxAddEasily(@RequestBody Easily easily)throws Exception;

@RequestMapping(value = "/qdtxModifyEasily",method = RequestMethod.POST)
public Integer qdtxModifyEasily(@RequestBody Easily easily)throws Exception;
}

