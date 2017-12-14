package com.chen.entity;

/**
 * 视频实体
 */
public class VideoInfo {

    private long videoId;

    private String pic; //截图地址

    private String url; //播放地址

    private String title; //标题

    private String time;  //时间

    private String duration; //播放时长

    private String source; //视频来源

    private String subTitle; //视频类型

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Override
    public String toString() {
        return "VideoInfo [videoId=" + videoId + ", pic=" + pic + ", url=" + url
                + ", time=" + time + ", duration=" + duration + ", source=" + source
                + ", subTitle=" + subTitle + "]";
    }
}
