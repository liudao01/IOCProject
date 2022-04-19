package com.demo.ioc_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.demo.ioc_project.module.HttpModule;

import javax.inject.Inject;

public class SecActivity extends AppCompatActivity {

    private String TAG = "SecActivity";
//    @Inject
//    HttpModule httpModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        MyApplication.getInstance().getAppComponent().injectSecActivity(this);

//        Log.d(TAG, "onCreate: httpModule = "+httpModule.hashCode());
    }
}