package com.demo.ioc_project.di;


import com.demo.ioc_project.scope.UserScope;

import dagger.Component;

@UserScope
@Component(modules = {PresenterModule.class})
public interface PresenterComponent {
    //使用依赖关系，就不再使用这种语法
//    void inject(MainActivity activity);
    Presenter providerPresenter();
}
