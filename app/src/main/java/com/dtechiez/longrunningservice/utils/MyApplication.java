package com.dtechiez.longrunningservice.utils;

import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Util.scheduleJob(getApplicationContext());
    }
}
