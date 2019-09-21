package com.zb.mapper;
import com.zb.pojo.Car;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarMapper {

	public Car getCarById(@Param(value = "id") Integer id)throws Exception;

	public List<Car>	getCarListByMap(Map<String,Object> param)throws Exception;

	public Integer getCarCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCar(Car car)throws Exception;

	public Integer updateCar(Car car)throws Exception;


}
