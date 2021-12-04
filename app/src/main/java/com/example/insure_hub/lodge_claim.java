package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class lodge_claim extends AppCompatActivity {


    ImageView mprofile;
    ImageView mHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodge_claim);


        mprofile= findViewById(R.id.imageView8);
        mHome= findViewById(R.id.imageView9);

        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(lodge_claim.this, CLAIMS.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(lodge_claim.this, Profile.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}