package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.component;

import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = ApplicationModule.class)
public interface AppComponent {
}
