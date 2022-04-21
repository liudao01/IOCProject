package com.demo.mytesthilt;

import android.app.Application;

import dagger.hilt.android.HiltAndroidApp;

/**
 * Created by liuml on 2022/4/21 11:08
 */
@HiltAndroidApp
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}