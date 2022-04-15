package com.demo.ioc_project.module;

import com.demo.ioc_project.object.HttpObject;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liuml on 2022/4/14 10:48
 *
 * 这个类用来提供对象
 */

@Module
public class HttpModule {

    @Provides
    @Singleton
    public HttpObject providerHttpObject(){
        return new HttpObject();
    }
} 