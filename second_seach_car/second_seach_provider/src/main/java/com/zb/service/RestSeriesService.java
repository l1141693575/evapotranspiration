package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.SeriesMapper;
import com.zb.pojo.Series;

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
public class RestSeriesService {

     @Autowired
     private SeriesMapper seriesMapper;

     @RequestMapping(value = "/getSeriesById",method = RequestMethod.POST)
     public Series getSeriesById(@RequestParam("id") Integer id)throws Exception{
        return seriesMapper.getSeriesById(id);
     }

     @RequestMapping(value = "/getSeriesListByMap",method = RequestMethod.POST)
     public List<Series>	getSeriesListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return seriesMapper.getSeriesListByMap(param);
     }

     @RequestMapping(value = "/getSeriesCountByMap",method = RequestMethod.POST)
     public Integer getSeriesCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return seriesMapper.getSeriesCountByMap(param);
     }


}
