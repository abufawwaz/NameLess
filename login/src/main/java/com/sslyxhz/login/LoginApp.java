package com.sslyxhz.login;

import android.app.Application;

import com.sslyxhz.base.BaseApp;
import com.sslyxhz.basecomponent.ServiceFactory;

public class LoginApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
