package com.chen.dao;

import com.chen.entity.ForumInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ForumInfoDao {

    List<ForumInfo> getForumInfo(@Param("keyword") String keyword,
                                 @Param("startRow") int startRow,
                                 @Param("pageSize") int pageSize);

}
