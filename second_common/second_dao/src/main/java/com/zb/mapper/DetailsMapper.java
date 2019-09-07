package com.zb.mapper;
import com.zb.pojo.Details;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DetailsMapper {

	public Details getDetailsById(@Param(value = "id") Integer id)throws Exception;

	public List<Details>	getDetailsListByMap(Map<String,Object> param)throws Exception;

	public Integer getDetailsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDetails(Details details)throws Exception;

	public Integer updateDetails(Details details)throws Exception;


}
