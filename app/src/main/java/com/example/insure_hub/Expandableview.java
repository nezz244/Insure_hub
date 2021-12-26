 package com.example.insure_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

 public class Expandableview extends AppCompatActivity {

    ExpandableListView expandableview;

    ArrayList<String> listGroup= new ArrayList<>();
    HashMap<String, ArrayList<String>> listChild = new HashMap<>();

    com.example.insure_hub.MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandableview);

        expandableview= findViewById(R.id.Expandableview);

        for(int g=0; g<=3; g++){

            listGroup.add(g,"Personnel Information");

            ArrayList<String> arrayList= new ArrayList<>();

            for(int c=0;c<=5; c++){
                arrayList.add("item"+c);


            }
            listChild.put(listGroup.get(g), arrayList);
        }

        adapter= new com.example.insure_hub.MainAdapter(listGroup, listChild);

        expandableview.setAdapter(adapter);
    }
}