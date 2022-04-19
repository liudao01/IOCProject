package com.demo.ioc_project;


import com.demo.ioc_project.di.PresenterComponent;
import com.demo.ioc_project.scope.AppScope;

import dagger.Component;

/**
 * 组件
 */
@AppScope
@Component(modules = {HttpModule.class, DatabaseModule.class}
        ,dependencies = {PresenterComponent.class})
public interface MyComponent {
    //这里的参数是不能用多态
    void injectMainActivity(MainActivity activity);
    void injectSecActivity(SecActivity activity);
}
