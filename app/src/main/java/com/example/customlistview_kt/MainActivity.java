package com.example.customlistview_kt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<ThanhPho> thanhPhoArrayList;
    ThanhPhoAdapter thanhPhoAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lv);
        thanhPhoArrayList= new ArrayList<>();

        thanhPhoArrayList.add(new ThanhPho("kien","123",1));
        thanhPhoArrayList.add(new ThanhPho("b","HN",123));
        thanhPhoArrayList.add(new ThanhPho("c","hcm",334));
        thanhPhoArrayList.add(new ThanhPho("x","hcm",5566));
        thanhPhoArrayList.add(new ThanhPho("a","hcm",123));

        thanhPhoAdapter= new ThanhPhoAdapter(this,R.layout.thanhpho_main,thanhPhoArrayList);
        lv.setAdapter(thanhPhoAdapter);


    }
}
