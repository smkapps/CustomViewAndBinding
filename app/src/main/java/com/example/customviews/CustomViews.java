package com.example.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Oleja on 25.10.2017.
 */

public class CustomViews extends LinearLayout {

    private String customText;
    private Context context;
    public CustomViews(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public CustomViews(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
       init();

    }

    public CustomViews(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }

    private void init() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.custom_view, this);
        Button button = view.findViewById(R.id.buton);
        final TextView textV = view.findViewById(R.id.textView);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textV.setText("Click");
            }
        });

    }


}
