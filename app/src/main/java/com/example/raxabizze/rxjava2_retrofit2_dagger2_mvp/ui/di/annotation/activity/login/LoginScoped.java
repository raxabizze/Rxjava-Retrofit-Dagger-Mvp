package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.annotation.activity.login;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginScoped {
}
