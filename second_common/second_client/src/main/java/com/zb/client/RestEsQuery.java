package com.zb.client;

import com.zb.fallback.ChassisClientFallBack;
import com.zb.pojo.Car;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@FeignClient(name = "second-seach-provider", fallback = ChassisClientFallBack.class)
public interface RestEsQuery  {

    @RequestMapping(value = "/getesquery")
    public       List<Car> queryManyBetweenMatch(@RequestParam(required = false) Map<String,Object> map) throws IOException;
}
