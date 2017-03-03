package com.example.dzy.game2048;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

/**
 * Created by dzy on 2017/3/3.
 */

public class gameView extends GridLayout {

    public gameView(Context context) {
        super(context);

        initGameView();
    }

    public gameView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initGameView();
    }

    public gameView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initGameView();
    }

    private void initGameView() {
        setOnTouchListener(new View.OnTouchListener(){

            private float startX,startY,offsetX,offsetY;

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        startX = event.getX();
                        startY = event.getY();
                        break;
                    case MotionEvent.ACTION_UP:
                        offsetX = event.getX() - startX;
                        offsetY = event.getY() - startY;

                        //防止用户向右下角方向滑动，不知该算什么方向，所以用绝对值来算
                        

                        break;
                    default:
                        break;
                }


                return true;
            }
        });
    }
}
