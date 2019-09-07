package com.zb.fallback;

import com.zb.pojo.Series;

import com.zb.client.RestSeriesClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class SeriesClientFallBack implements RestSeriesClient {


    @Override
    public Series getSeriesById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Series>	getSeriesListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getSeriesCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddSeries(Series series)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifySeries(Series series)throws Exception{
        return null;
    }
}
