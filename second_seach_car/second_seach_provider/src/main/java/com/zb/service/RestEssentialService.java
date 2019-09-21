package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.EssentialMapper;
import com.zb.pojo.Essential;

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
public class RestEssentialService {

     @Autowired
     private EssentialMapper essentialMapper;

     @RequestMapping(value = "/getEssentialById",method = RequestMethod.POST)
     public Essential getEssentialById(@RequestParam("id") Integer id)throws Exception{
        return essentialMapper.getEssentialById(id);
     }

     @RequestMapping(value = "/getEssentialListByMap",method = RequestMethod.POST)
     public List<Essential>	getEssentialListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return essentialMapper.getEssentialListByMap(param);
     }

     @RequestMapping(value = "/getEssentialCountByMap",method = RequestMethod.POST)
     public Integer getEssentialCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return essentialMapper.getEssentialCountByMap(param);
     }


}
