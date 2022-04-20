package com.example.hilt_baseuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.hilt_baseuse.interfacedi.TestInterface;

import javax.inject.Inject;
import javax.inject.Qualifier;

import dagger.hilt.InstallIn;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;

    @Inject
    HttpObject httpObject2;

    @Inject
    TestInterface testInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("jett",httpObject.hashCode()+"");
        Log.i("jett",httpObject2.hashCode()+"");
        testInterface.method();
    }

    public void click(View view) {
        startActivity(new Intent(this,SecActivity.class));
    }
}