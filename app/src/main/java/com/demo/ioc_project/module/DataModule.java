package com.demo.ioc_project.module;

import com.demo.ioc_project.object.DataObject;
import com.demo.ioc_project.object.HttpObject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liuml on 2022/4/14 10:48
 * <p>
 * 这个类用来提供对象
 */
@Module
public class DataModule {

    @Provides
    public DataObject providerDataObject() {
        return new DataObject();
    }
} 