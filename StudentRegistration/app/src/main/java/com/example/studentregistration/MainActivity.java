package com.example.studentregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edittext1,edittext2;
    private TextView textview;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1=findViewById(R.id.editTextTextPersonName);
        edittext2=findViewById(R.id.editTextTextPersonName2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edittext1.getText().toString();
                String roll=edittext2.getText().toString();
                Toast.makeText(MainActivity.this,  name+"  Succesfully Registered", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,LogindisplayActivity.class);
                i.putExtra("name_p",name);
                i.putExtra("roll_p",roll);
                startActivity(i);


            }
        });

    }
}