package com.example.dagger2_demo_02.di;

import com.example.dagger2_demo_02.object.ObjectForTestSubModule;

import dagger.Module;
import dagger.Provides;

@Module
public class TestSubModule {
    @Provides
    public ObjectForTestSubModule providerObjectForTestSubModule(){
        return new ObjectForTestSubModule();
    }
}
