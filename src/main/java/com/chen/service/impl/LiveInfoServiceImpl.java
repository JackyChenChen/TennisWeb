package com.chen.service.impl;

import com.chen.dao.LiveInfoDao;
import com.chen.entity.LiveInfo;
import com.chen.service.LiveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiveInfoServiceImpl implements LiveInfoService {

    @Autowired
    LiveInfoDao liveInfoDao;

    @Override
    public List<LiveInfo> getLiveInfo() {
        return liveInfoDao.getLiveInfo();
    }

}
