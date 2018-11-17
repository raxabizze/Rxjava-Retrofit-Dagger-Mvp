package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiModule {
    String URL = "";


    @Provides
    Retrofit ProvideRetrofit() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        return new Retrofit.Builder()
                .baseUrl(URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
