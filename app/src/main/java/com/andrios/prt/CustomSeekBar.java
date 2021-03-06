package com.andrios.prt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.SeekBar;

import java.util.ArrayList;

/**
 * Created by Corey on 1/6/2017.
 */

public class CustomSeekBar extends SeekBar {
    private static final String TAG = "CustomSeekBar";
    private ArrayList<ProgressItem> mProgressItemsList;

    public CustomSeekBar(Context context){
        super(context);
    }

    public CustomSeekBar(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public CustomSeekBar(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
    }

    public void initData(ArrayList<ProgressItem> progressItemsList){
        Log.d(TAG, "initData: ");
        this.mProgressItemsList = progressItemsList;
    }

    @Override
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    protected void onDraw(Canvas canvas){
        if(mProgressItemsList.size() > 0){
            int progressBarWidth = getWidth();
            int progressBarHeight = getHeight();
            int thumbOffset = getThumbOffset();
            int lastProgressX = 0;
            int progressItemWidth, progressItemRight;
            for(int i = 0; i < mProgressItemsList.size(); i++){
                ProgressItem progressItem = mProgressItemsList.get(i);
                Paint progressPaint = new Paint();
                progressPaint.setColor(getResources().getColor(progressItem.color));
                progressItemWidth = (int) (progressItem.progressItemPercentage * progressBarWidth / 100);
                progressItemRight = lastProgressX + progressItemWidth;
                if(i == mProgressItemsList.size() - 1 && progressItemRight != progressBarWidth){
                    progressItemRight = progressBarWidth;
                }
                Rect progressRect = new Rect();
                progressRect.set(lastProgressX, thumbOffset / 2, progressItemRight, progressBarHeight - thumbOffset / 2);
                canvas.drawRect(progressRect, progressPaint);
                lastProgressX = progressItemRight;
            }
            super.onDraw(canvas);
        }
    }
}
