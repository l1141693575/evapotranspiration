package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.PhotoMapper;
import com.zb.pojo.Photo;

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
public class RestPhotoService {

     @Autowired
     private PhotoMapper photoMapper;

     @RequestMapping(value = "/getPhotoById",method = RequestMethod.POST)
     public Photo getPhotoById(@RequestParam("id") Integer id)throws Exception{
        return photoMapper.getPhotoById(id);
     }

     @RequestMapping(value = "/getPhotoListByMap",method = RequestMethod.POST)
     public List<Photo>	getPhotoListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return photoMapper.getPhotoListByMap(param);
     }

     @RequestMapping(value = "/getPhotoCountByMap",method = RequestMethod.POST)
     public Integer getPhotoCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return photoMapper.getPhotoCountByMap(param);
     }


}
