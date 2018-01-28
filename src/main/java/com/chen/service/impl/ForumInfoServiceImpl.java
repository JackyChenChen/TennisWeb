package com.chen.service.impl;

import com.chen.dao.ForumInfoDao;
import com.chen.entity.ForumInfo;
import com.chen.service.ForumInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumInfoServiceImpl implements ForumInfoService {

    @Autowired
    private ForumInfoDao forumInfoDao;

    @Override
    public List<ForumInfo> getForumInfo(String keyword,int pageSize,int pageNum) {
        int startRow = pageSize*(pageNum - 1);
        return forumInfoDao.getForumInfo(keyword,startRow,pageSize);
    }
}
