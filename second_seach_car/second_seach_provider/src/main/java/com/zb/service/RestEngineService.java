package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.EngineMapper;
import com.zb.pojo.Engine;

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
public class RestEngineService {

     @Autowired
     private EngineMapper engineMapper;

     @RequestMapping(value = "/getEngineById",method = RequestMethod.POST)
     public Engine getEngineById(@RequestParam("id") Integer id)throws Exception{
        return engineMapper.getEngineById(id);
     }

     @RequestMapping(value = "/getEngineListByMap",method = RequestMethod.POST)
     public List<Engine>	getEngineListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return engineMapper.getEngineListByMap(param);
     }

     @RequestMapping(value = "/getEngineCountByMap",method = RequestMethod.POST)
     public Integer getEngineCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return engineMapper.getEngineCountByMap(param);
     }


}
