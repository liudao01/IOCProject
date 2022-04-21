package com.demo.mytesthilt.model;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;

/**
 * Created by liuml on 2022/4/21 11:09
 */
@InstallIn(ActivityComponent.class)
@Module
public class HttpModel {

    @Provides
    @ActivityScoped
    public HttpObject getHttpObject(){
        return new HttpObject();
    }
} 