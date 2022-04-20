package com.example.dagger2_demo_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


import com.example.dagger2_demo_02.di.DaggerMainComponent;
import com.example.dagger2_demo_02.di.MainModule;
import com.example.dagger2_demo_02.di.TestSubModule;
import com.example.dagger2_demo_02.object.A;
import com.example.dagger2_demo_02.object.B;
import com.example.dagger2_demo_02.object.ObjectForMainModule;
import com.example.dagger2_demo_02.object.ObjectForTestSubModule;
import com.example.dagger2_demo_02.object.User;


import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    @Inject
    ObjectForMainModule objectForMainModule;
    @Inject
    ObjectForTestSubModule objectForTestSubModule;

    @Named("key1")
    @Inject
    User user1;
    @Named("key2")
    @Inject
    User user2;

    @Inject
    A a;
    @Inject
    B b;


    //延迟加载注解
    @Inject
    Lazy<A> lazy;//A是我们定义的对象
    @Inject
    Provider<A> provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      DaggerMainComponent.create()
              .getTestSubComponent()
              .injectMainActivity(this);

        Log.i("jett",objectForMainModule.hashCode()+"");
        Log.i("jett",objectForTestSubModule.hashCode()+"");
        Log.i("jett",user1.hashCode()+"");
        Log.i("jett",user2.hashCode()+"");
        Log.i("jett",a.hashCode()+"");
        Log.i("jett",b.hashCode()+"");

        Log.i("jett",lazy.get().hashCode()+"");
        Log.i("jett",provider.get().hashCode()+"");


    }
}