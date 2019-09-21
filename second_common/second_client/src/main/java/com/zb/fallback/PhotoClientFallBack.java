package com.zb.fallback;

import com.zb.pojo.Photo;

import com.zb.client.RestPhotoClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class PhotoClientFallBack implements RestPhotoClient {


    @Override
    public Photo getPhotoById(Integer id)throws Exception{
        return null;
    }

    @Override
    public List<Photo>	getPhotoListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getPhotoCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddPhoto(Photo photo)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyPhoto(Photo photo)throws Exception{
        return null;
    }
}
