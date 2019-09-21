package com.zb.client;
import com.zb.pojo.Details;

import com.zb.fallback.DetailsClientFallBack;
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
@FeignClient(name = "second-seach-provider", fallback = DetailsClientFallBack.class)
public interface RestDetailsClient {
@RequestMapping(value = "/getDetailsById",method = RequestMethod.POST)
public Details getDetailsById(@RequestParam("id") Integer id)throws Exception;

@RequestMapping(value = "/getDetailsListByMap",method = RequestMethod.POST)
public List<Details>	getDetailsListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDetailsCountByMap",method = RequestMethod.POST)
public Integer getDetailsCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDetails",method = RequestMethod.POST)
public Integer qdtxAddDetails(@RequestBody Details details)throws Exception;

@RequestMapping(value = "/qdtxModifyDetails",method = RequestMethod.POST)
public Integer qdtxModifyDetails(@RequestBody Details details)throws Exception;
}

