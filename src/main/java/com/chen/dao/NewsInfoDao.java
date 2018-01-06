package com.chen.dao;

import com.chen.entity.NewsInfo;
import com.chen.entity.NewsType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsInfoDao {

    /**
     * 根据新闻类型获取新闻列表
     * @param newsType
     * @return
     */
    List<NewsInfo> getNewsInfoByNewsType(@Param("newsType") String newsType,
                                         @Param("startRow")int startRow,
                                         @Param("pageSize")int pageSize);

    /**
     * 获取新闻类型
     * @return
     */
    List<NewsType> getNewsType();

}
