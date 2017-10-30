package com.example.customviews;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

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
        final View view = LayoutInflater.from(getContext()).inflate(R.layout.custom_view, this);
        view.setEnabled(false);
        Button button = view.findViewById(R.id.button);
        final EditText editText = view.findViewById(R.id.etName);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view1) {
                if (!editText.getText().toString().isEmpty()) {
                    customText = editText.getText().toString();
                    callOnClick();
                    editText.setEnabled(false);
                    view1.setVisibility(GONE);
                }
            }
        });

    }

    public String getCustomText() {
        return customText;
    }


}
