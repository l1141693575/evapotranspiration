package com.zb.mapper;
import com.zb.pojo.Chassis;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChassisMapper {

	public Chassis getChassisById(@Param(value = "id") Integer id)throws Exception;

	public List<Chassis>	getChassisListByMap(Map<String,Object> param)throws Exception;

	public Integer getChassisCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertChassis(Chassis chassis)throws Exception;

	public Integer updateChassis(Chassis chassis)throws Exception;


}
