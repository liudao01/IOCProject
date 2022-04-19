package com.example.dagger2_demo_02.di;

import com.example.dagger2_demo_02.object.A;
import com.example.dagger2_demo_02.object.B;
import com.example.dagger2_demo_02.object.ObjectForMainModule;
import com.example.dagger2_demo_02.object.ObjectForTestSubModule;
import com.example.dagger2_demo_02.object.User;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    public ObjectForMainModule providerObjectForMainModule(){
        return new ObjectForMainModule();
    }

    @Provides
    public B providerB(){
        return new B();
    }
    @Provides
    public A providerA(B b){
        return new A(b);
    }

    @Named("key1")
    @Provides
    public User provideUser(){
        return new User("jett","123");
    }
    @Named("key2")
    @Provides
    public User provideUser2(){
        return new User("jett2","456");
    }
}
