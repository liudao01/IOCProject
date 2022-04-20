package com.example.httpprocessor_20200413.httpprocessor;

/**
 * 顶层的回调接口
 */
public interface ICallback {
    void onSuccess(String result);
    void onFailure(String e);
}
