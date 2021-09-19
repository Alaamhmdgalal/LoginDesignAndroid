package com.example.androidbooster07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText mEmailHint, mPassHint;
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blue_design);

        mEmailHint = findViewById(R.id.email_hint);

        mLogin = findViewById(R.id.Login);
        mLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.Login)
            openSecondScreen();
    }

    private void openSecondScreen(){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Msg", mEmailHint.getText().toString());
        intent.putExtra("Msg", mPassHint.getText().toString());
        startActivity(intent);
    }
}