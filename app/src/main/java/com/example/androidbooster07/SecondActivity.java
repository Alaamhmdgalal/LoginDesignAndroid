package com.example.androidbooster07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView nextView = findViewById(R.id.second_text_label);

        String incomingMsg = getIntent().getStringExtra("Msg");
        nextView.setText(incomingMsg);
    }
}