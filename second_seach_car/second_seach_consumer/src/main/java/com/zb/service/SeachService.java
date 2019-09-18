package com.zb.service;

import com.zb.Dto;

import java.util.Map;

public interface SeachService {
    public Dto getCarByMap(Map<String,Object> map);
}
