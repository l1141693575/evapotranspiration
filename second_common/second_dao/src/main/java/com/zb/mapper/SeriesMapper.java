package com.zb.mapper;
import com.zb.pojo.Series;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SeriesMapper {

	public Series getSeriesById(@Param(value = "id") Integer id)throws Exception;

	public List<Series>	getSeriesListByMap(Map<String,Object> param)throws Exception;

	public Integer getSeriesCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSeries(Series series)throws Exception;

	public Integer updateSeries(Series series)throws Exception;


}
