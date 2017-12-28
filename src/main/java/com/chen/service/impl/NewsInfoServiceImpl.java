package com.chen.service.impl;

import com.chen.dao.NewsInfoDao;
import com.chen.entity.NewsInfo;
import com.chen.entity.NewsType;
import com.chen.service.NewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsInfoServiceImpl implements NewsInfoService {

    @Autowired
    NewsInfoDao newsInfoDao;

    @Override
    public List<NewsType> getNewsType() {
        return newsInfoDao.getNewsType();
    }

    @Override
    public List<NewsInfo> getNewsInfoByNewsType(String newsType,int pageSize,int pageNum) {
        int startRow = pageSize*(pageNum - 1);
        return newsInfoDao.getNewsInfoByNewsType(newsType,startRow,pageSize);
    }
}
