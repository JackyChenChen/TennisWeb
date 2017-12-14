package com.chen.controller;

import com.chen.dto.Result;
import com.chen.entity.VideoInfo;
import com.chen.entity.VideoType;
import com.chen.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private VideoInfoService videoInfoService;

    @RequestMapping(value = "/getVideo",method = RequestMethod.POST)
    public Result<Object>  getVideoInfo(@RequestParam("source") String source,
                                      @RequestParam("subTitle") String subTitle,
                                      @RequestParam("condition") String condition){
        List<VideoInfo> videoInfoList = videoInfoService.queryVideoInfoByCondition(source,subTitle,condition);
        return getResult(videoInfoList);
    }

    @RequestMapping(value = "/getVideoType",method = RequestMethod.POST)
    public Result<Object> getVideoType(){
        List<VideoType> videoTypeList = videoInfoService.getVideoTypes();
        return getResult(videoTypeList);
    }

    /**
     * 封装数据结果
     * @param object
     * @return
     */
    private Result<Object> getResult(Object object){
        Result<Object> result = new Result<>();
        if (object instanceof List){
            if (object == null || ((List) object).size() <= 0){
                failure(result);
            }else{
                success(result);
            }
        }else{
            if (object == null){
                failure(result);
            }else{
                success(result);
            }
        }
        result.setData(object);
        return result;
    }

    private void success(Result result){
        result.setSuccess(true);
        result.setError("请求数据成功");
    }

    private void failure(Result result){
        result.setSuccess(false);
        result.setError("请求数据失败");
    }

}
