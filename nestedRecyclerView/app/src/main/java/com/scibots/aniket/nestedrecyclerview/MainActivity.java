package com.scibots.aniket.nestedrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.scibots.aniket.nestedrecyclerview.adapter.outerAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView outerRecyclerView;
    outerAdapter outer_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outer_adapter = new outerAdapter(MainActivity.this);
        outerRecyclerView = (RecyclerView) findViewById(R.id.mainRecyler);
        outerRecyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        );
        outerRecyclerView.setAdapter(outer_adapter);
    }
}
