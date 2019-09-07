package com.zb.mapper;
import com.zb.pojo.Easily;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EasilyMapper {

	public Easily getEasilyById(@Param(value = "id") Integer id)throws Exception;

	public List<Easily>	getEasilyListByMap(Map<String,Object> param)throws Exception;

	public Integer getEasilyCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertEasily(Easily easily)throws Exception;

	public Integer updateEasily(Easily easily)throws Exception;


}
