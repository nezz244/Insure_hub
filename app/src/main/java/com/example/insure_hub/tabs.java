package com.example.insure_hub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class tabs extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        tabLayout=findViewById(R.id.tablayout);

       viewPager=findViewById(R.id.viewpager);




        vpadapter vpAdapter= new PagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
                return false;
            }
        };
        vpAdapter.addFragment(new Fragment1(),"TAB1");
        vpAdapter.addFragment(new Fragment2(),"TAB2");
        vpAdapter.addFragment(new Fragment3(),"TAB3");


        viewPager.setAdapter(vpAdapter);
    }
}