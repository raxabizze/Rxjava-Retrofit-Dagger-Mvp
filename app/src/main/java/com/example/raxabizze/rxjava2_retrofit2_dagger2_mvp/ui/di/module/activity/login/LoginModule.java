package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.module.activity.login;

import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.ui.login.LoginContract;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {
    private LoginContract.View view;

    public LoginModule(LoginContract.View view) {
        this.view = view;
    }

    @Provides
    LoginContract.View provideView() {
        return view;
    }
}
