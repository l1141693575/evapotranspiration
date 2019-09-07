package com.zb.mapper;
import com.zb.pojo.Photo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PhotoMapper {

	public Photo getPhotoById(@Param(value = "id") Integer id)throws Exception;

	public List<Photo>	getPhotoListByMap(Map<String,Object> param)throws Exception;

	public Integer getPhotoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertPhoto(Photo photo)throws Exception;

	public Integer updatePhoto(Photo photo)throws Exception;


}
