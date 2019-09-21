package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.EasilyMapper;
import com.zb.pojo.Easily;

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
public class RestEasilyService {

     @Autowired
     private EasilyMapper easilyMapper;

     @RequestMapping(value = "/getEasilyById",method = RequestMethod.POST)
     public Easily getEasilyById(@RequestParam("id") Integer id)throws Exception{
        return easilyMapper.getEasilyById(id);
     }

     @RequestMapping(value = "/getEasilyListByMap",method = RequestMethod.POST)
     public List<Easily>	getEasilyListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return easilyMapper.getEasilyListByMap(param);
     }

     @RequestMapping(value = "/getEasilyCountByMap",method = RequestMethod.POST)
     public Integer getEasilyCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return easilyMapper.getEasilyCountByMap(param);
     }


}
