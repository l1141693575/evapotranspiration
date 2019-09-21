package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.CarMapper;
import com.zb.pojo.Car;

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
public class RestCarService {

     @Autowired
     private CarMapper carMapper;

     @RequestMapping(value = "/getCarById",method = RequestMethod.POST)
     public Car getCarById(@RequestParam("id") Integer id)throws Exception{
        return carMapper.getCarById(id);
     }

     @RequestMapping(value = "/getCarListByMap",method = RequestMethod.POST)
     public List<Car>	getCarListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return carMapper.getCarListByMap(param);
     }

     @RequestMapping(value = "/getCarCountByMap",method = RequestMethod.POST)
     public Integer getCarCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return carMapper.getCarCountByMap(param);
     }

}
