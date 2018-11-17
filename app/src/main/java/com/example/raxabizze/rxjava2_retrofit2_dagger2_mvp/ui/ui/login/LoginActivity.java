package com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.ui.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.R;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.AppApplication;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.test_qulifier.Coder;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.test_qulifier.Level;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.component.activity.login.DaggerLoginComponent;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.di.module.activity.login.LoginModule;
import com.example.raxabizze.rxjava2_retrofit2_dagger2_mvp.ui.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements LoginContract.View {
    @BindView(R.id.btn)
    Button button;

    @BindView(R.id.tv)
    TextView textView;

    @Inject
    LoginPresenter<LoginContract.View>  presenter;

    @Inject
    @Level("low")
    Coder lowLevelCoder;

    @Inject
    @Level("high")
    Coder highLevelCoder;

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            presenter.onLoginEvent("10", "0000");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    @Override
    public void init() {
        button.setOnClickListener(listener);

        DaggerLoginComponent.builder()
                .appComponent(((AppApplication) getApplicationContext()).getAppComponent())
                .loginModule(new LoginModule(this))
                .build().inject(this);
        Log.e("log", lowLevelCoder.getName() + highLevelCoder.getName());
    }

    @Override
    public void onLoginResponse(String response) {
        textView.setText(response);
    }
}
