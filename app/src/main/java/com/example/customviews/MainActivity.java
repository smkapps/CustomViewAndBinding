package com.example.customviews;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;
    FloatingActionButton fab;
    List<String> nameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = (LinearLayout) findViewById(R.id.container);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        final CustomViews customViews = (CustomViews) findViewById(R.id.customV);

        customViews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameList.add(customViews.getCustomText());
                addCustomView();
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putStringArrayListExtra(Main2Activity.EXTRA_LIST, (ArrayList<String>) nameList);
                startActivity(intent);
            }
        });
    }

    void addCustomView() {
        final CustomViews customViews = new CustomViews(this);
        customViews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCustomView();
                nameList.add(customViews.getCustomText());
            }
        });
        container.addView(customViews);
    }
}
