package com.github.xch168.annotationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.xch168.bindview.annotation.BindView;
import com.github.xch168.bindview.api.BindViewTool;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.content)
    TextView mContentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BindViewTool.bind(this);


        mContentText.setText("From BindView");
    }
}


