package com.chen.dao;

import com.chen.entity.VideoInfo;
import com.chen.entity.VideoType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoInfoDao {

    List<VideoInfo> queryVideoInfoByCondition(@Param("source") String source,
                                              @Param("subTitle") String subTitle,
                                              @Param("condition") String condition,
                                              @Param("startRow") int startRow,
                                              @Param("pageSize") int pageSize);


    List<VideoType> getVideoTypes();

}
