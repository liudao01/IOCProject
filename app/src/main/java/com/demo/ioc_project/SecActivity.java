package com.demo.ioc_project;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;


import com.demo.ioc_project.object.HttpObject;

import javax.inject.Inject;

public class SecActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
//        DaggerMyComponent.builder()
//                .httpModule(new HttpModule())
//                .databaseModule(new DatabaseModule())
//                .build()
//                //到这里，初始化了module和component
//                .injectSecActivity(this);

        ((MyApplication)getApplication())
                .getAppComonent()
                .injectSecActivity(this);

        Log.i("jett",httpObject.hashCode()+"-sec");
    }
}