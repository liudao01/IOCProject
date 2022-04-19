package com.demo.ioc_project;

import com.demo.ioc_project.module.DataModule;
import com.demo.ioc_project.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by liuml on 2022/4/14 10:50
 * 组件 用来放module的 需要那些module
 */
@Singleton
@Component(modules = {HttpModule.class, DataModule.class})
public interface MyComponent {
    //这里的参数不能用多态
    void inject(MainActivity activity);

    void injectSecActivity(SecActivity activity);

} 