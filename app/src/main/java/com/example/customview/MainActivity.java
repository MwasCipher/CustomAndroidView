package com.example.customview;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.view.View;

import java.util.jar.Attributes;

public class CustomView extends View {

    //circle and text colors
    private int circleCol, labelCol;
    //label text
    private String circleText;
    //paint for drawing custom view
    private Paint circlePaint;

    public CustomView(Context context, Attributes attrs){
        super(context, attrs);

        circlePaint = new Paint();

        TypedArray array = context.getTheme()
                .obtainStyledAttributes(attrs, R.styleable.LovelyView, 0, 0)
    }





}
