package com.example.lurzeood.draganddraw;

import android.graphics.PointF;

/**
 * Created by Lurzeood on 2017/7/8 0008.
 */

public class Box {

    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin){
        mOrigin = origin;
        mCurrent = origin;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        this.mCurrent = current;
    }
}
