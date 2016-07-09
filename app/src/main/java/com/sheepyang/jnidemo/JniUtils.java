package com.sheepyang.jnidemo;

/**
 * Created by SheepYang on 2016/6/22 13:49.
 */
public class JniUtils {
    static{
        System.loadLibrary("JniLib");
    }

    public native int addInt(int a, int b);
}
