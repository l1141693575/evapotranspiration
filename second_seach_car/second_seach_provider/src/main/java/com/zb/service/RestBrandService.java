package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.BrandMapper;
import com.zb.pojo.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * Created by dm
 */
@RestController
public class RestBrandService {

     @Autowired
     private BrandMapper brandMapper;

     @RequestMapping(value = "/getBrandById",method = RequestMethod.POST)
     public Brand getBrandById(@RequestParam("id") Integer id)throws Exception{
        return brandMapper.getBrandById(id);
     }

     @RequestMapping(value = "/getBrandListByMap",method = RequestMethod.POST)
     public List<Brand>	getBrandListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return brandMapper.getBrandListByMap(param);
     }

     @RequestMapping(value = "/getBrandCountByMap",method = RequestMethod.POST)
     public Integer getBrandCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return brandMapper.getBrandCountByMap(param);
     }

 
}
