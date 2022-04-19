package com.example.dagger2_demo_02.di;

import com.example.dagger2_demo_02.MainActivity;

import dagger.Component;

@Component(modules = {MainModule.class})
public interface MainComponent {
    TestSubComponent getTestSubComponent();
}
