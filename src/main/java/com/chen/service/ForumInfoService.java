package com.chen.service;

import com.chen.entity.ForumInfo;

import java.util.List;

public interface ForumInfoService {

    List<ForumInfo> getForumInfo(String keyword,int pageSize,int pageNum);

}
