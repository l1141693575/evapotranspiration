package com.zb.client;
import com.zb.pojo.Great;

import com.zb.fallback.GreatClientFallBack;
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
@FeignClient(name = "second-seach-provider", fallback = GreatClientFallBack.class)
public interface RestGreatClient {
@RequestMapping(value = "/getGreatById",method = RequestMethod.POST)
public Great getGreatById(@RequestParam("id") Integer id)throws Exception;

@RequestMapping(value = "/getGreatListByMap",method = RequestMethod.POST)
public List<Great>	getGreatListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getGreatCountByMap",method = RequestMethod.POST)
public Integer getGreatCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddGreat",method = RequestMethod.POST)
public Integer qdtxAddGreat(@RequestBody Great great)throws Exception;

@RequestMapping(value = "/qdtxModifyGreat",method = RequestMethod.POST)
public Integer qdtxModifyGreat(@RequestBody Great great)throws Exception;
}

