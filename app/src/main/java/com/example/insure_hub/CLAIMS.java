package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CLAIMS extends AppCompatActivity {
    ImageButton mClaims;
    ImageButton mLodge_Claims;
    ImageView mprofile;
    ImageView mHome;
    ImageView mOptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claims);

        mClaims= findViewById(R.id.imageButton10);
        mLodge_Claims= findViewById(R.id.imageButton12);

        mprofile= findViewById(R.id.imageView12);
        mHome= findViewById(R.id.imageView14);

        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(CLAIMS.this, Home.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(CLAIMS.this, Profile.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mLodge_Claims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(CLAIMS.this, lodge_claim.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        mClaims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(CLAIMS.this, Home.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}