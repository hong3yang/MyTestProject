package com.example.hong3.testproject;

/**
 * Created by hong3 on 2016-12-25.
 */

public class JniUtil {

    static {
        System.loadLibrary("myNativeLib");
    }

    public native String getStringFromNative();
}
