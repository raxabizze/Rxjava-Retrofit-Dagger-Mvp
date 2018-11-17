package com.example.raxabizze.rxjavaretrofitdaggermvp.ui.di.module.activity.login;

import com.example.raxabizze.rxjavaretrofitdaggermvp.ui.ui.login.LoginContract;

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
