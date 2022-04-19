package com.demo.ioc_project;

import android.app.Application;

import com.demo.ioc_project.module.HttpModule;

/**
 * Created by liuml on 2022/4/19 10:57
 */
public class MyApplication extends Application {

    private MyComponent myComponent;

    private static MyApplication myApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        //也可以使用建造者模式 方便动态修改参数,传递参数
        myComponent = DaggerMyComponent.builder()
                .httpModule(new HttpModule())
                .build();
    }

    public MyComponent getAppComponent() {
        return myComponent;
    }

    public static MyApplication getInstance() {
        return myApplication;
    }
}