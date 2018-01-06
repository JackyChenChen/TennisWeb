package com.chen.dto;

public class Result<T> {

    private boolean success; //是否成功表示

    private String error; //错误信息

    private boolean isLastPage = true; //是否是最后一页

    private T data; //数据

    public Result(){}

    //成功时候构造器
    public Result(boolean success,T data){
        this.success = success;
        this.data = data;
    }

    // 错误时的构造器
    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public Result(boolean success, String error, T data){
        this.success = success;
        this.error = error;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public void setLastPage(boolean lastPage) {
        isLastPage = lastPage;
    }
}
