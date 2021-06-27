package com.example.studentregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LogindisplayActivity extends AppCompatActivity {
    private TextView textview11,textview22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logindisplay);
        textview11=findViewById(R.id.textView2);
        textview22=findViewById(R.id.textView7);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String roll=intent.getStringExtra("roll");
        textview11.setText(name);
        textview22.setText(roll);

    }
}