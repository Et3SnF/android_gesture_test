package com.ngynstvn.android.gesturetest;

import android.util.Log;

/**
 * Created by Ngynstvn on 2/18/16.
 */
public class Utils {

    public static String classTag(Class className) {
        return "(" + className.getSimpleName() + ")";
    }

    public static void logMethod(String className) {
        final StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String message = stackTraceElements[3].getMethodName() + " method called | Thread: " +
                Thread.currentThread().getName();
        Log.e(className, message);
    }

    public static void logMethod(String className, String additional) {
        final StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String message = additional + "'s " + stackTraceElements[3].getMethodName() + "() called | Thread: "
                + Thread.currentThread().getName();
        Log.e(className, message);
    }

}
