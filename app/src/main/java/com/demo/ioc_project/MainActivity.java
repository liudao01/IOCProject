package com.demo.ioc_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTest = findViewById(R.id.tv_test);

        DaggerMyComponent.create().inject(this);
        DaggerMyComponent.builder()
                .build()
                .inject(this);

        tvTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DaggerMyComponent.builder()
                        .build()
                        .inject(MainActivity.this);

            }
        });


        httpObject.post();
        Log.d(TAG, "onCreate: httpObject " + httpObject.hashCode());
        Log.d(TAG, "onCreate: httpObject2 " + httpObject2.hashCode());


        //也可以使用建造者模式 方便动态修改参数,传递参数

    }
}