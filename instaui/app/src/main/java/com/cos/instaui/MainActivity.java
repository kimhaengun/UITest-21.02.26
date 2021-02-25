package com.cos.instaui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTop;
    private TopAdapter topAdapter;

    private RecyclerView rvContainer;
    private BodyAdapter bodyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Top> tops = new ArrayList<>();

        for (int i=0; i<10; i++){
            tops.add(new Top("topUserName"));
        }
        //Manager생성
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);

        rvTop = findViewById(R.id.rv_top);
        rvTop.setLayoutManager(manager);
        topAdapter = new TopAdapter(tops);
        rvTop.setAdapter(topAdapter);
        //
        List<Body> bodys = new ArrayList<>();
        for (int i=0; i<3; i++){
            bodys.add(new Body("bodyUserName"));
        }
        LinearLayoutManager manager2 = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);

        rvContainer = findViewById(R.id.rv_cotainer);
        rvContainer.setLayoutManager(manager2);
        bodyAdapter = new BodyAdapter(bodys);
        rvContainer.setAdapter(bodyAdapter);
    }
}