package com.zb.client;
import com.zb.pojo.Essential;

import com.zb.fallback.EssentialClientFallBack;
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
@FeignClient(name = "second-seach-provider", fallback = EssentialClientFallBack.class)
public interface RestEssentialClient {
@RequestMapping(value = "/getEssentialById",method = RequestMethod.POST)
public Essential getEssentialById(@RequestParam("id") Integer id)throws Exception;

@RequestMapping(value = "/getEssentialListByMap",method = RequestMethod.POST)
public List<Essential>	getEssentialListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getEssentialCountByMap",method = RequestMethod.POST)
public Integer getEssentialCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddEssential",method = RequestMethod.POST)
public Integer qdtxAddEssential(@RequestBody Essential essential)throws Exception;

@RequestMapping(value = "/qdtxModifyEssential",method = RequestMethod.POST)
public Integer qdtxModifyEssential(@RequestBody Essential essential)throws Exception;
}

