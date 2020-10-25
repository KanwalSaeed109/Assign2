package com.codewitkanwal.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String check1 = intent.getStringExtra("c1");
        String check2 = intent.getStringExtra("c2");
        String check3 = intent.getStringExtra("c3");
        String check4 = intent.getStringExtra("c4");
        TextView textview = findViewById(R.id.textView);
        textview.setText(check1+","+check2+","+check3+","+check4+" are checked");
    }
}