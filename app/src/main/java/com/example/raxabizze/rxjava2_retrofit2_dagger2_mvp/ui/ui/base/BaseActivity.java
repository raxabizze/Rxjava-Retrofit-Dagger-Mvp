package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.ui.base;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity implements BaseView{
    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
