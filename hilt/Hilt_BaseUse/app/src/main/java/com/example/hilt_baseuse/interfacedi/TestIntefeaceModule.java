package com.example.hilt_baseuse.interfacedi;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class TestIntefeaceModule {
    @Binds           //接口                   实例
    public abstract TestInterface bindTestClass(TestClass testClass);
}
