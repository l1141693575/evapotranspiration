package com.zb.controller;

import com.zb.Dto;
import com.zb.service.SeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SeachController {
    @Autowired
    SeachService seachService;
    @RequestMapping("/seachcar")
    public Dto seachcar(@RequestParam Map<String,Object> map){
        return  seachService.getCarByMap(map);
    }

}
