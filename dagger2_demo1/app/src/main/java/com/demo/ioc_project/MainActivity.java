package com.demo.ioc_project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.ioc_project.di.Presenter;
import com.demo.ioc_project.object.HttpObject;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;//= new HttpObject()
    @Inject
    HttpObject httpObject2;

    @Inject
    Presenter presenter;
    @Inject
    Presenter presenter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerMyComponent.create().injectMainActivity(this);

//        DaggerMyComponent.builder()
//                .httpModule(new HttpModule())
//                .databaseModule(new DatabaseModule())
//                .build()
//                //到这里，初始化了module和component
//                .injectMainActivity(this);

        ((MyApplication)getApplication())
                .getAppComonent()
                .injectMainActivity(this);

        Log.i("jett",httpObject.hashCode()+"");
        Log.i("jett",httpObject2.hashCode()+"");

        Log.i("jett",presenter.hashCode()+"");
        Log.i("jett",presenter2.hashCode()+"");
    }

    public void click(View view) {
        startActivity(new Intent(this, SecActivity.class));
    }
}








