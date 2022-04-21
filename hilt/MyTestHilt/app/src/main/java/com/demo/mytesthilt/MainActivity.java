package com.demo.mytesthilt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.demo.mytesthilt.model.HttpModel;
import com.demo.mytesthilt.model.HttpObject;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;
    @Inject
    HttpObject httpObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "httpObject.hashCode(): "+httpObject.hashCode());
        Log.d("MainActivity", "httpObject.hashCode(): "+httpObject.hashCode());
    }
}