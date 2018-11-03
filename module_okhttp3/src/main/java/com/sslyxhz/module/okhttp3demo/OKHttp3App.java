package com.sslyxhz.module.okhttp3demo;

import android.app.Application;

import com.sslyxhz.base.BaseApp;
import com.sslyxhz.base.component.ServiceFactory;

public class OKHttp3App extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {

    }

    @Override
    public void initModuleData(Application application) {

    }
}
