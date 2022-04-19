package com.demo.ioc_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.demo.ioc_project.object.HttpObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";
    //注入后直接用
    @Inject
    HttpObject httpObject;
    @Inject
    HttpObject httpObject2;
    private TextView tvTest;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTest = findViewById(R.id.tv_test);
        button = findViewById(R.id.button);

        button.setOnClickListener((view -> {
            startActivity(new Intent(this, SecActivity.class));
        }));
//        DaggerMyComponent.create().inject(this);
//        DaggerMyComponent.builder()
//                .build()
//                .inject(this);

        //通过统一创建Component
        MyApplication.getInstance().getAppComponent().inject(this);


        httpObject.post();
        Log.d(TAG, "onCreate: httpObject " + httpObject.hashCode());
        Log.d(TAG, "onCreate: httpObject2 " + httpObject2.hashCode());




    }
}