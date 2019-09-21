package com.zb.mapper;
import com.zb.pojo.Engine;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EngineMapper {

	public Engine getEngineById(@Param(value = "id") Integer id)throws Exception;

	public List<Engine>	getEngineListByMap(Map<String,Object> param)throws Exception;

	public Integer getEngineCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertEngine(Engine engine)throws Exception;

	public Integer updateEngine(Engine engine)throws Exception;


}
