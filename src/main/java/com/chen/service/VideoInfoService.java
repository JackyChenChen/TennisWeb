package com.chen.service;

import com.chen.entity.VideoInfo;
import com.chen.entity.VideoType;

import java.util.List;

public interface VideoInfoService {

    List<VideoInfo> queryVideoInfoByCondition(String source,
                                              String sub_title,
                                              String condition,
                                              int pageNum,
                                              int pageSize);

    List<VideoType> getVideoTypes();

}
