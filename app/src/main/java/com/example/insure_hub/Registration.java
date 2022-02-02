package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
    TextView serviceprovider ,brocker, personal,bussiness;
    ImageView Arrowback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);



        serviceprovider= findViewById(R.id.textViw6);
        brocker= findViewById(R.id.textiew6);
        personal= findViewById(R.id.textView);
        bussiness= findViewById(R.id.textVew6);

        Arrowback=findViewById(R.id.imageView2);

        serviceprovider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Registration.this, Tabsserviceproviderform.class);
                startActivity(intent);
                finish();
                return;

            }
        });


        brocker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Registration.this, Tabsbrockerform.class);
                startActivity(intent);
                finish();
                return;

            }
        });


        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Registration.this, Tabspersonalform.class);
                startActivity(intent);
                finish();
                return;

            }
        });

        bussiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Registration.this, Tabbusinessform.class);
                startActivity(intent);
                finish();
                return;

            }
        });



        Arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Registration.this, Home.class);
                startActivity(intent);
                finish();
                return;

            }
        });
    }


}