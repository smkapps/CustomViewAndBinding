package com.example.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Oleja on 28.10.2017.
 */

public class CustomViewAttr extends View {
    private String titleText;

    public CustomViewAttr(Context context) {
        super(context);
    }

    public CustomViewAttr(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.CustomViews, 0, 0);
        titleText = a.getString(R.styleable.CustomViews_custom_text);

    }

    public CustomViewAttr(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public String getTitleText(){
        return titleText;
    }
}
