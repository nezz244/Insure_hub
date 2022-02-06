package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Premiums extends AppCompatActivity {
    TextView receive ,collect, make,recover;
    ImageView Arrowback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premiums);


        receive= findViewById(R.id.textViw);
        collect= findViewById(R.id.textiew6);
        make= findViewById(R.id.textView);
        recover= findViewById(R.id.textVew6);

        Arrowback=findViewById(R.id.imageView2);


        receive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Premiums.this, Tabsserviceproviderform.class);
                startActivity(intent);
                finish();
                return;

            }
        });


        collect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Premiums.this, Tabsbrockerform.class);
                startActivity(intent);
                finish();
                return;

            }
        });


        make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Premiums.this, Tabspersonalform.class);
                startActivity(intent);
                finish();
                return;

            }
        });

        recover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Premiums.this, Tabbusinessform.class);
                startActivity(intent);
                finish();
                return;

            }
        });



      Arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Premiums.this, Home.class);
                startActivity(intent);
                finish();
                return;

            }
        });

    }


}
