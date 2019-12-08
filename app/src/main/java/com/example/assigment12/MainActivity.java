package com.example.assigment12;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private GestureDetector myDetector;

    RelativeLayout layout;
    boolean iscolor = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        layout = findViewById(R.id.rlayout);
        myDetector = new GestureDetector(MainActivity.this, this);


    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {

        if(iscolor) {
            layout.setBackgroundColor(Color.BLACK);
            iscolor = false;
        } else {
            layout.setBackgroundColor(Color.WHITE);
            iscolor = true;
        }

        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {

        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        float diffY = e2.getY() - e1.getY();
        float diffX = e2.getX() - e1.getX();

        if (Math.abs(diffX) > Math.abs(diffY)) {
            if (Math.abs(diffX) > 100 && Math.abs(velocityX) > 100) {
                if (diffX > 0) {
                        layout.setBackgroundColor(Color.rgb(diffY, diffX, 00));
                } else {
                        layout.setBackgroundColor(Color.rgb(diffY, diffX, 00));
                }
                return true;
            }
        } else {
            if (Math.abs(diffY) > 100 && Math.abs(velocityY) > 100) {
                if (diffY > 0) {
                    layout.setBackgroundColor(Color.rgb(diffY, diffX, 00));
                } else {
                    layout.setBackgroundColor(Color.rgb(diffY, diffX, 00));
                }
                return true;
            }

        }

        return false;


    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        myDetector.onTouchEvent(event);
        return super.onTouchEvent(event);

    }

}
