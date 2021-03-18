package com.zb.client;
import com.zb.pojo.${table.className};

import com.zb.fallback.${table.className}ClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = ${table.className}ClientFallBack.class)
public interface Rest${table.className}Client {
@RequestMapping(value = "/get${table.className}ById",method = RequestMethod.POST)
public ${table.className} get${table.className}ById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/get${table.className}ListByMap",method = RequestMethod.POST)
public List<${table.className}>	get${table.className}ListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/get${table.className}CountByMap",method = RequestMethod.POST)
public Integer get${table.className}CountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAdd${table.className}",method = RequestMethod.POST)
public Integer qdtxAdd${table.className}(@RequestBody ${table.className} ${lowerClassName})throws Exception;

@RequestMapping(value = "/qdtxModify${table.className}",method = RequestMethod.POST)
public Integer qdtxModify${table.className}(@RequestBody ${table.className} ${lowerClassName})throws Exception;
}
