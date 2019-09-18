package com.zb.service.impl;

import com.zb.Dto;
import com.zb.DtoUtil;
import com.zb.client.RestEsQuery;
import com.zb.service.SeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;
@Service
public class SeachServiceImpl implements SeachService {
    @Autowired
    RestEsQuery restEsQuery;
    @Override
    public Dto getCarByMap(Map<String, Object> map){
        try {
            return DtoUtil.returnSuccess("ok",restEsQuery.queryManyBetweenMatch(map));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  DtoUtil.returnSuccess("input");
    }
}
