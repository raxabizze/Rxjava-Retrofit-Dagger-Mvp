package com.example.raxabizze.rxjavaretrofitdaggermvp.ui.utils.api.pojo;

public class LoginRequest {
    private String account;
    private String password;

    public LoginRequest(String account, String password) {
        this.account = account;
        this.password = password;
    }
}
