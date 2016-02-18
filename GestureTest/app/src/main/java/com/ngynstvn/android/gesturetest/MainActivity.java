package com.ngynstvn.android.gesturetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private static final String CLASS_TAG = Utils.classTag(MainActivity.class);

    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Utils.logMethod(CLASS_TAG);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureDetector = new GestureDetector(this, this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    /**
     *
     * Implemented Methods
     *
     */

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
//        Utils.logMethod(CLASS_TAG);
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
//        Utils.logMethod(CLASS_TAG);
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
//        Utils.logMethod(CLASS_TAG);
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
//        Utils.logMethod(CLASS_TAG);
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
//        Utils.logMethod(CLASS_TAG);
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
//        Utils.logMethod(CLASS_TAG);
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Utils.logMethod(CLASS_TAG);
        Log.v(CLASS_TAG, "Distance X: " + distanceX + " | " + "Distance Y: " + distanceY);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
//        Utils.logMethod(CLASS_TAG);
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Utils.logMethod(CLASS_TAG);
        Log.v(CLASS_TAG, "Event1: " + e1.getAction() + " | " + "Event2: " + e1.getAction() + " | "
                + "VelocityX: " + velocityX + " | " + "VelocityY: " + velocityY);
        return false;
    }
}
