package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.test_qulifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Level {
    String value() default "";
}