package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui;

import android.app.Application;

import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.component.AppComponent;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.component.DaggerAppComponent;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.module.ApplicationModule;

public class AppApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}