package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.DetailsMapper;
import com.zb.pojo.Details;

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
public class RestDetailsService {

     @Autowired
     private DetailsMapper detailsMapper;

     @RequestMapping(value = "/getDetailsById",method = RequestMethod.POST)
     public Details getDetailsById(@RequestParam("id") Integer id)throws Exception{
        return detailsMapper.getDetailsById(id);
     }

     @RequestMapping(value = "/getDetailsListByMap",method = RequestMethod.POST)
     public List<Details>	getDetailsListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return detailsMapper.getDetailsListByMap(param);
     }

     @RequestMapping(value = "/getDetailsCountByMap",method = RequestMethod.POST)
     public Integer getDetailsCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return detailsMapper.getDetailsCountByMap(param);
     }

}
