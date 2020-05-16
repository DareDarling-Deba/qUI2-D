package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Final extends AppCompatActivity {
    int count;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        tv1 = (TextView) findViewById(R.id.textView);
        Intent i = getIntent();
        count = i.getIntExtra("val", 0);
        tv1.setText("Your Final Score=" + count);
    }
}
