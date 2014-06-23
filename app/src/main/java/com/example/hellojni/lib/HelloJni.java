package com.example.hellojni.lib;

/**
 * Created by Yvonne on 6/17/2014.
 */
public class HelloJni {
    public native String  stringFromJNI();

    public native String jniNameFromJNI();

    /* this is used to load the 'hello-jni' library on application
     * startup. The library has already been unpacked into
     * /data/data/com.example.hellojni/lib/libhello-jni.so at
     * installation time by the package manager.
     */
    static {
        System.loadLibrary("hello-jni");
    }
}
