package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    ImageView mprofile;
    ImageView mHome;
    ImageView mOptions;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       // requestWindowFeature(Window.FEATURE_NO_TITLE);
      //  this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    //    getSupportActionBar().hide();

        mprofile= findViewById(R.id.imageView16);
        mHome= findViewById(R.id.imageView13);

        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Home.this, CLAIMS.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Home.this, Profile.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }

}