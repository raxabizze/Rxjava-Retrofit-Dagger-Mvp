package com.example.raxabizze.rxjavaretrofitdaggermvp.ui.ui.login;

import com.example.raxabizze.rxjavaretrofitdaggermvp.ui.ui.base.BaseView;

public interface LoginContract {
    interface View extends BaseView {
        void onLoginResponse(String response);
    }

    interface Presenter<V extends View> {
        void onLoginEvent(String account, String password);
    }
}
