package com.example.belgitask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTask;
    private ArrayList<Task> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTask = findViewById(R.id.rv_task);
        rvTask.setHasFixedSize(true);

        list.addAll(DataTask.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTask.setLayoutManager(new LinearLayoutManager(this));
        ListTaskAdapter listTaskAdapter = new ListTaskAdapter(list);
        rvTask.setAdapter(listTaskAdapter);
    }
}