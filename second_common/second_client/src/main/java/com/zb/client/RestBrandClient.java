package com.zb.client;
import com.zb.pojo.Brand;

import com.zb.fallback.BrandClientFallBack;
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
@FeignClient(name = "second-seach-provider", fallback = BrandClientFallBack.class)
public interface RestBrandClient {
@RequestMapping(value = "/getBrandById",method = RequestMethod.POST)
public Brand getBrandById(@RequestParam("id") Integer id)throws Exception;

@RequestMapping(value = "/getBrandListByMap",method = RequestMethod.POST)
public List<Brand>	getBrandListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getBrandCountByMap",method = RequestMethod.POST)
public Integer getBrandCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddBrand",method = RequestMethod.POST)
public Integer qdtxAddBrand(@RequestBody Brand brand)throws Exception;

@RequestMapping(value = "/qdtxModifyBrand",method = RequestMethod.POST)
public Integer qdtxModifyBrand(@RequestBody Brand brand)throws Exception;
}

