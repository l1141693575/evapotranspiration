package com.zb.mapper;
import com.zb.pojo.Essential;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EssentialMapper {

	public Essential getEssentialById(@Param(value = "id") Integer id)throws Exception;

	public List<Essential>	getEssentialListByMap(Map<String,Object> param)throws Exception;

	public Integer getEssentialCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertEssential(Essential essential)throws Exception;

	public Integer updateEssential(Essential essential)throws Exception;


}
