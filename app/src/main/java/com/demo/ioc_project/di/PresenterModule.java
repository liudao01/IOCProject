package com.demo.ioc_project.di;



import com.demo.ioc_project.scope.UserScope;

import dagger.Module;
import dagger.Provides;

@UserScope
@Module
public class PresenterModule {

    @UserScope
    @Provides
    public Presenter providePresenter(){
        return new Presenter();
    }
}
