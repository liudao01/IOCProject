package com.example.dagger2_demo_02.di;

import com.example.dagger2_demo_02.MainActivity;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent(modules = {TestSubModule.class})
public interface TestSubComponent {
    void injectMainActivity(MainActivity activity);
}
