package com.chen.controller;

import com.chen.dto.Result;
import com.chen.entity.*;
import com.chen.service.ForumInfoService;
import com.chen.service.LiveInfoService;
import com.chen.service.NewsInfoService;
import com.chen.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private VideoInfoService videoInfoService;

    @Autowired
    private NewsInfoService newsInfoService;

    @Autowired
    private LiveInfoService liveInfoService;

    @Autowired
    private ForumInfoService forumInfoService;

    @RequestMapping(value = "/getVideoType",method = RequestMethod.POST)
    public Result<Object> getVideoType(){
        List<VideoType> videoTypeList = videoInfoService.getVideoTypes();
        return getResult(videoTypeList,0);
    }


    @RequestMapping(value = "/getVideo",method = RequestMethod.POST)
    public Result<Object>  getVideoInfo(@RequestParam("source") String source,
                                        @RequestParam("subTitle") String subTitle,
                                        @RequestParam("condition") String condition,
                                        @RequestParam("pageSize") int pageSize,
                                        @RequestParam("pageNum") int pageNum){
        List<VideoInfo> videoInfoList = videoInfoService.queryVideoInfoByCondition(source,subTitle,condition,pageNum,pageSize);
        return getResult(videoInfoList,pageSize);
    }


    @RequestMapping(value = "/getNewsType",method = RequestMethod.POST)
    public Result<Object> getNewsType(){
        List<NewsType> newsTypeList = newsInfoService.getNewsType();
        return getResult(newsTypeList,0);
    }

    @RequestMapping(value = "/getNewsInfo",method = RequestMethod.POST)
    public Result<Object> getNewsInfoByNewsType(@RequestParam("newsType") String newsType,
                                                @RequestParam("pageSize") int pageSize,
                                                @RequestParam("pageNum") int pageNum){
        List<NewsInfo> newsInfoList = newsInfoService.getNewsInfoByNewsType(newsType,pageSize,pageNum);
        return getResult(newsInfoList,pageSize);
    }

    @RequestMapping(value = "/getLiveInfo",method = RequestMethod.POST)
    public Result<Object> getLiveInfo(){
        List<LiveInfo> liveInfoList = liveInfoService.getLiveInfo();
        return getResult(liveInfoList,0);
    }

    @RequestMapping(value = "/getForumInfo",method = RequestMethod.POST)
    public Result<Object> getForumInfo(
            @RequestParam("keyword") String keyword,
            @RequestParam("pageSize") int pageSize,
            @RequestParam("pageNum") int pageNum){
        List<ForumInfo> forumInfoList = forumInfoService.getForumInfo(keyword,pageSize,pageNum);
        return getResult(forumInfoList,pageSize);
    }


    /**
     * 封装数据结果
     * @param object
     * @param pageSize  pageSize == 0 代表没有翻页
     * @return
     */
    private Result<Object> getResult(Object object,int pageSize){
        Result<Object> result = new Result<>();
        if (object instanceof List){
            if (object == null || ((List) object).size() <= 0){
                failure(result);
            }else{
                //判断是否是最后一页
                int size = ((List) object).size();
                if (size == pageSize){
                    result.setLastPage(false);
                }
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
