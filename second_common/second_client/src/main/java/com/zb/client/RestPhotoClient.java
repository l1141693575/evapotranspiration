package com.zb.client;
import com.zb.pojo.Photo;

import com.zb.fallback.PhotoClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = PhotoClientFallBack.class)
public interface RestPhotoClient {
@RequestMapping(value = "/getPhotoById",method = RequestMethod.POST)
public Photo getPhotoById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getPhotoListByMap",method = RequestMethod.POST)
public List<Photo>	getPhotoListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getPhotoCountByMap",method = RequestMethod.POST)
public Integer getPhotoCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddPhoto",method = RequestMethod.POST)
public Integer qdtxAddPhoto(@RequestBody Photo photo)throws Exception;

@RequestMapping(value = "/qdtxModifyPhoto",method = RequestMethod.POST)
public Integer qdtxModifyPhoto(@RequestBody Photo photo)throws Exception;
}

