package com.demo.ioc_project;


import com.demo.ioc_project.object.HttpObject;
import com.demo.ioc_project.scope.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * 这个类用来提供对象
 */
@AppScope
@Module
public class HttpModule {

    @AppScope
    @Provides
    public HttpObject providerHttpObject(){
        return new HttpObject();
    }
}







