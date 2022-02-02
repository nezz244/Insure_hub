package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class samplesketch extends AppCompatActivity {
    ImageView arrow4;
    CardView cardView4;
    LinearLayout hiddenView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samplesketch);

        cardView4 = findViewById(R.id.base_cardview4);
        arrow4 = findViewById(R.id.arrow_button4);
        hiddenView5 = findViewById(R.id.hidden_view4);

        arrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // If the CardView is already expanded, set its visibility
                // to gone and change the expand less icon to expand more.
                if (hiddenView5.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    // by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardView4,
                            new AutoTransition());
                    hiddenView5.setVisibility(View.GONE);
                    arrow4.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardView4,
                            new AutoTransition());
                    hiddenView5.setVisibility(View.VISIBLE);
                    arrow4.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });


    }
}