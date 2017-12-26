package com.chen.service;

import com.chen.entity.NewsInfo;
import com.chen.entity.NewsType;

import java.util.List;

public interface NewsInfoService {

    List<NewsType> getNewsType();

    List<NewsInfo> getNewsInfoByNewsType(String newsType);

}
