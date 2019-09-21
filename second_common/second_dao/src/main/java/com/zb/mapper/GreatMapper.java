package com.zb.mapper;
import com.zb.pojo.Great;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GreatMapper {

	public Great getGreatById(@Param(value = "id") Integer id)throws Exception;

	public List<Great>	getGreatListByMap(Map<String,Object> param)throws Exception;

	public Integer getGreatCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGreat(Great great)throws Exception;

	public Integer updateGreat(Great great)throws Exception;


}
