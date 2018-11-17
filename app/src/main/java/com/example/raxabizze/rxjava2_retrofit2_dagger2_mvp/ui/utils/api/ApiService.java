package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.utils.api;

import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.utils.api.pojo.LoginRequest;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.utils.api.pojo.LoginResponse;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/api/auth")
    @Headers("Accept: max-age=640000, Accept")
    Observable<LoginResponse> onLogin(@Body LoginRequest loginRequest);
}
