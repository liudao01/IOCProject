package com.demo.ioc_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.demo.ioc_project.object.HttpObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";
    //注入后直接用
    @Inject
    HttpObject httpObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMyComponent.create().inject(this);

        httpObject.post();
        Log.d(TAG, "onCreate: httpObject "+httpObject.hashCode());
    }
}