package com.zb.fallback;

import com.zb.pojo.Brand;

import com.zb.client.RestBrandClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class BrandClientFallBack implements RestBrandClient {


    @Override
    public Brand getBrandById(Integer id)throws Exception{
        return null;
    }

    @Override
    public List<Brand>	getBrandListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getBrandCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddBrand(Brand brand)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyBrand(Brand brand)throws Exception{
        return null;
    }
}
