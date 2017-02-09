package com.example.hong3.testproject.app;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by hong3 on 2016/11/28.
 */

public class MyApplication extends Application {

    private String MYAPPID = "3f1bea6bafb59111c6d3cdb1c9a39368";

    @Override
    public void onCreate() {
        super.onCreate();

        Bmob.initialize(this,MYAPPID);
    }
}
