package com.example.hilt_baseuse.interfacedi;

import android.util.Log;

import javax.inject.Inject;

public class TestClass implements TestInterface{



    @Inject
    TestClass(){}

    @Override
    public void method() {
        Log.i("jett","注入成功");
    }
}
