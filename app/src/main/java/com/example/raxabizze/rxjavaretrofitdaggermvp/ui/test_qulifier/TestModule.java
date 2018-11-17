package com.example.raxabizze.rxjavaretrofitdaggermvp.ui.test_qulifier;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {
    @Provides
    @Level("low") Coder provideLowLevelCoder() {
        Coder coder = new Coder();
        coder.setName("123");
        coder.setPower(5);
        return coder;
    }

    @Provides @Level("high") Coder provideHighLevelCoder() {
        Coder coder = new Coder();
        coder.setName("abc");
        coder.setPower(1000);
        return coder;
    }


}
