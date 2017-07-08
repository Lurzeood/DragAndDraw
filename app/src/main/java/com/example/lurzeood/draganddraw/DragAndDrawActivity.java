package com.example.lurzeood.draganddraw;

import android.support.v4.app.Fragment;

public class DragAndDrawActivity extends SinglefragmentActivity{


    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
