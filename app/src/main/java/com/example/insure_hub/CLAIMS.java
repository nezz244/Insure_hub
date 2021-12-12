package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CLAIMS extends AppCompatActivity {
    ImageView mDamageAssessment;
    ImageView mLodge_Claims;
    ImageView mTrack_Claim;
    ImageView mCancel_Claim;
    ImageView mAdminister;
    ImageView mAssesorTasks;
    ImageView mViewClaims;

    ImageView mprofile;
    ImageView mHome;
    ImageView mOptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claims);
        getWindow().setStatusBarColor(ContextCompat.getColor(CLAIMS.this, R.color.white));

        mTrack_Claim= findViewById(R.id.mTrackClaim);
        mCancel_Claim=findViewById(R.id.mCancelClaim);
        mAdminister=findViewById(R.id.mAdminister);
        mAssesorTasks=findViewById(R.id.mAssessorTasks);
        mViewClaims=findViewById(R.id.mViewClaims);
        mDamageAssessment= findViewById(R.id.mDamageAssessment);
        mLodge_Claims= findViewById(R.id.mlodgeclaim);

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
        mDamageAssessment.setOnClickListener(new View.OnClickListener() {
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