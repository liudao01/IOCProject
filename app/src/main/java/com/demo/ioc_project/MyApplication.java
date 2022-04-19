package com.demo.ioc_project;

import android.app.Application;

import com.demo.ioc_project.di.DaggerPresenterComponent;


public class MyApplication extends Application {
    private MyComponent myComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        myComponent=DaggerMyComponent.builder()
                .httpModule(new HttpModule())
                .databaseModule(new DatabaseModule())
                .presenterComponent(DaggerPresenterComponent.create())
                .build();

    }
    public MyComponent getAppComonent(){
        return myComponent;
    }
}
