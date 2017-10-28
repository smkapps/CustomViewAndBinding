package com.example.customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomViewAttr customViews = (CustomViewAttr)findViewById(R.id.customVAttr);
        Log.d("Tag", customViews.getTitleText());
    }
}
