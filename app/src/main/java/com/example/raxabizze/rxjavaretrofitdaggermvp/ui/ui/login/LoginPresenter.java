package com.example.raxabizze.rxjavaretrofitdaggermvp.ui.ui.login;

import android.util.Log;

import com.example.raxabizze.rxjavaretrofitdaggermvp.ui.utils.api.ApiService;
import com.example.raxabizze.rxjavaretrofitdaggermvp.ui.utils.api.pojo.LoginRequest;
import com.example.raxabizze.rxjavaretrofitdaggermvp.ui.utils.api.pojo.LoginResponse;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class LoginPresenter<V extends LoginContract.View> implements LoginContract.Presenter<V>{
    private LoginContract.View view;
    private Retrofit retrofit;
    private String TAG = "TAG";

    @Inject
    public LoginPresenter(LoginContract.View view, Retrofit retrofit) {
        this.view = view;
        this.retrofit = retrofit;
    }

    @Override
    public void onLoginEvent(String account, String password) {
        retrofit.create(ApiService.class)
                .onLogin(new LoginRequest(account, password))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    private Observer<LoginResponse> observer = new Observer<LoginResponse>() {
        @Override
        public void onSubscribe(Disposable d) {
            Log.e(TAG, "onSubscribe: ");
        }

        @Override
        public void onNext(LoginResponse response) {
            Log.e(TAG, "onNext: " + response.getToken());
            view.onLoginResponse(response.getToken());
        }

        @Override
        public void onError(Throwable e) {
            Log.e(TAG, "onError: " + e.getMessage());
        }

        @Override
        public void onComplete() {
            Log.e(TAG, "onComplete: Over!");
        }
    };
}
