package com.example.insure_hub;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MainAdapter extends BaseExpandableListAdapter {
    ArrayList<String> listGroup;
    HashMap<String, ArrayList<String>> listChild;
    public  MainAdapter(ArrayList<String> listGroup, HashMap<String, ArrayList<String>> listChild){
        this.listGroup= listGroup;
        this.listChild= listChild;

    }
    @Override
    public int getGroupCount() {
        return listGroup.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listChild.get(listGroup.get(groupPosition)).size();

    }

    @Override
    public Object getGroup(int groupPosition) {
        return listGroup.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listChild.get(listGroup.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {




        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);


        TextView textView= view.findViewById(android.R.id.text1);

        String sGroup=String.valueOf(getGroup(groupPosition));

        textView.setText(sGroup);

        textView.setTypeface(null, Typeface.BOLD);

        textView.setTextColor(Color.BLUE);

        return view;



    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {


        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);



        TextView textView= view.findViewById(android.R.id.text1);
        String sChild= String.valueOf(getChild(groupPosition,childPosition));

        textView.setText(sChild);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(),sChild, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
