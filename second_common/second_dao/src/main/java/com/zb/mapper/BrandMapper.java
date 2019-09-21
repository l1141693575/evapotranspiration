package com.zb.mapper;
import com.zb.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BrandMapper {

	public Brand getBrandById(@Param(value = "id") Integer id)throws Exception;

	public List<Brand>	getBrandListByMap(Map<String,Object> param)throws Exception;

	public Integer getBrandCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertBrand(Brand brand)throws Exception;

	public Integer updateBrand(Brand brand)throws Exception;


}
