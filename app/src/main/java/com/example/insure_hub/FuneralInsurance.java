package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FuneralInsurance extends AppCompatActivity {
    Button mhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funeral_insurance);
        getWindow().setStatusBarColor(ContextCompat.getColor(FuneralInsurance.this, R.color.white));

        mhome= findViewById(R.id.button4);

        mhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FuneralInsurance.this, Home.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}