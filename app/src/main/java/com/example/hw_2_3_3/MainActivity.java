package com.example.hw_2_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private IphoneAdapter adapter;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.rv_iphone);
        loadData();
        adapter = new IphoneAdapter(carList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        carList.add("1");
        carList.add("2");
        carList.add("3");
        carList.add("4");
        carList.add("5");
        carList.add("6");
        carList.add("6s");
        carList.add("6+");
        carList.add("7");
        carList.add("7+");
        carList.add("8");
        carList.add("8+");


    }
}