package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.ChassisMapper;
import com.zb.pojo.Chassis;

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
public class RestChassisService {

     @Autowired
     private ChassisMapper chassisMapper;

     @RequestMapping(value = "/getChassisById",method = RequestMethod.POST)
     public Chassis getChassisById(@RequestParam("id") Integer id)throws Exception{
        return chassisMapper.getChassisById(id);
     }

     @RequestMapping(value = "/getChassisListByMap",method = RequestMethod.POST)
     public List<Chassis>	getChassisListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return chassisMapper.getChassisListByMap(param);
     }

     @RequestMapping(value = "/getChassisCountByMap",method = RequestMethod.POST)
     public Integer getChassisCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return chassisMapper.getChassisCountByMap(param);
     }


}
