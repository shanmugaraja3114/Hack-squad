package com.example.karkapazhagu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Civilsem5 extends AppCompatActivity {

    String [] subject={"EN8491 - Water Supply Engineering","CE8591 - Foundation Engineering",
            "CE8501 - Design of Reinforced Cement Concrete Elements","CE8502 - Structural Analysis I","Professional Elective - I","Open Elective - I"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilsem5);
        listView = (findViewById(R.id.listview1));
        CustomAdapter c = new CustomAdapter();
        listView.setAdapter(c);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(getApplicationContext(), Csesem1sub1.class));

                }
                if (position == 1) {
                    startActivity(new Intent(getApplicationContext(), csesem1sub2.class));

                }
                if (position == 2) {
                    startActivity(new Intent(getApplicationContext(), Csesem1sub3.class));

                }
                if (position == 3) {
                    startActivity(new Intent(getApplicationContext(), Csesem1sub4.class));

                }
                if (position == 4) {
                    startActivity(new Intent(getApplicationContext(), Csesem1sub5.class));

                }
                if (position == 5) {
                    startActivity(new Intent(getApplicationContext(), Csesem1sub6.class));

                }

            }
        });
    }





    class  CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return subject.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v=getLayoutInflater().inflate(R.layout.mylayout1,null);
            TextView t=v.findViewById(R.id.subject);
            t.setText(subject[position]);
            return  v;
        }
    }





}