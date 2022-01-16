package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class lodge_claim extends AppCompatActivity {


    ImageView mprofile;
    ImageView mHome;
    ImageView mvehicleinsurance;
    ImageView mhouseholdinsurance;
    ImageView mfuneralinsurance;
    ImageView mlifeinsurance;
    ImageView mmedicalinsurance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodge_claim);
        getWindow().setStatusBarColor(ContextCompat.getColor(lodge_claim.this, R.color.white));


        mprofile= findViewById(R.id.imageView8);
        mHome= findViewById(R.id.imageView9);
        mvehicleinsurance=findViewById(R.id.vehicleinsurance);
        mhouseholdinsurance=findViewById(R.id.householdinsurance);
        mfuneralinsurance= findViewById(R.id.funeralinsurance);
        mlifeinsurance= findViewById(R.id.lifeinsurance);
        mmedicalinsurance=findViewById(R.id.medicalinsurance);

        mvehicleinsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(lodge_claim.this, TabsHomeinsurance.class);
                startActivity(intent);
                finish();
                return;

            }
        });

        mfuneralinsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(lodge_claim.this, TabsHomeinsurance.class);
                startActivity(intent);
                finish();

            }
        });

        mlifeinsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(lodge_claim.this, TabsHomeinsurance.class);
                 startActivity(intent);
                finish();

            }
        });

        mhouseholdinsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(lodge_claim.this, TabsHomeinsurance.class);
                startActivity(intent);
                finish();

            }
        });

        mmedicalinsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(lodge_claim.this, TabsHomeinsurance.class);
                startActivity(intent);
                finish();

            }
        });

        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(lodge_claim.this,  TabsHomeinsurance.class);
                startActivity(intent);
                finish();
            }
        });

        mprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(lodge_claim.this,TabsHomeinsurance.class);
                startActivity(intent);
                finish();

            }
        });
    }
}