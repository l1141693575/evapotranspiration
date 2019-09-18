package com.zb;

import com.zb.pojo.Car;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface EsQuery {
    public    List<Car>  queryManyBetweenMatch(Map<String,Object> map) throws IOException;
}
