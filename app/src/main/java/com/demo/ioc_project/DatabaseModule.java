package com.demo.ioc_project;


import com.demo.ioc_project.object.DatabaseObject;

import dagger.Module;
import dagger.Provides;

/**
 * 这个类用来提供对象
 */
@Module
public class DatabaseModule {
    @Provides
    public DatabaseObject providerDatabaseObject(){
        return new DatabaseObject();
    }
}







