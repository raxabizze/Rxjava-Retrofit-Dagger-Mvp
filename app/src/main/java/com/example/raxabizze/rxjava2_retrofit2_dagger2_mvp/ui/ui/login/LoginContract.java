package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.ui.login;

import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.ui.base.BaseView;

public interface LoginContract {
    interface View extends BaseView {
        void onLoginResponse(String response);
    }

    interface Presenter<V extends View> {
        void onLoginEvent(String account, String password);
    }
}
