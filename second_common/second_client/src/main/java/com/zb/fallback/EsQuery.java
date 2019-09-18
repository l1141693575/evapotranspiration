package com.zb.fallback;

import com.zb.client.RestEsQuery;
import com.zb.pojo.Car;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;
@Component
public class EsQuery implements RestEsQuery {

    @Override
    public List<Car> queryManyBetweenMatch(Map<String, Object> map) throws IOException {
        return null;
    }
}
