package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.component.activity.login;

import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.test_qulifier.TestModule;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.annotation.activity.login.LoginScoped;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.component.AppComponent;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.module.ApiModule;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.module.activity.login.LoginModule;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.ui.login.LoginActivity;

import dagger.Component;

@LoginScoped
@Component(dependencies = AppComponent.class, modules = {LoginModule.class, ApiModule.class, TestModule.class})
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
