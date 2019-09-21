package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.GreatMapper;
import com.zb.pojo.Great;

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
public class RestGreatService {

     @Autowired
     private GreatMapper greatMapper;

     @RequestMapping(value = "/getGreatById",method = RequestMethod.POST)
     public Great getGreatById(@RequestParam("id") Integer id)throws Exception{
        return greatMapper.getGreatById(id);
     }

     @RequestMapping(value = "/getGreatListByMap",method = RequestMethod.POST)
     public List<Great>	getGreatListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return greatMapper.getGreatListByMap(param);
     }

     @RequestMapping(value = "/getGreatCountByMap",method = RequestMethod.POST)
     public Integer getGreatCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return greatMapper.getGreatCountByMap(param);
     }

}
