package com.example.raxabizze.rxjavaretrofitdaggermvp.ui.di.component;

import com.example.raxabizze.rxjavaretrofitdaggermvp.ui.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface AppComponent {
}
