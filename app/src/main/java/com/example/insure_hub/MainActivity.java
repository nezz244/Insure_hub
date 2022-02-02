package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.white));

        mlogin= findViewById(R.id.login);


        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Home.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }

    public void submitbuttonHandler1(View view) {
        Intent intent= new Intent(MainActivity.this, Home.class);
        startActivity(intent);
        finish();
        return;
    }
}