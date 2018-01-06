package com.chen.service.impl;

import com.chen.dao.VideoInfoDao;
import com.chen.entity.VideoInfo;
import com.chen.entity.VideoType;
import com.chen.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoInfoServiceImpl implements VideoInfoService {

    @Autowired
    private VideoInfoDao videoInfoDao;


    @Override
    public List<VideoInfo> queryVideoInfoByCondition(String source, String sub_title,String condition,int pageNum,int pageSize) {
        int startRow = pageSize*(pageNum - 1);
        return videoInfoDao.queryVideoInfoByCondition(source,sub_title,condition,startRow,pageSize);
    }

    @Override
    public List<VideoType> getVideoTypes() {
        return videoInfoDao.getVideoTypes();
    }


}
