package com.example.httpprocessor_20200413.httpprocessor;

import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        HttpHelper.init(new VolleyProcessor(this));
//        HttpHelper.init(new XUtilsProcessor(this));
        HttpHelper.init(new OkHttpProcessor());
    }
}
