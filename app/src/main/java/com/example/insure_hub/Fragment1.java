package com.example.insure_hub;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {
    ExpandableListView expandableview;

    ArrayList<String> listGroup= new ArrayList<>();
    HashMap<String, ArrayList<String>> listChild = new HashMap<>();

    com.example.insure_hub.MainAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        expandableview= expandableview.findViewById(R.id.Expandableview);

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
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

       
    }
