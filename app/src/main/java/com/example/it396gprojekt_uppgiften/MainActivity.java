package com.example.it396gprojekt_uppgiften;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private Button aboutButton;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a19clasv";
    private ArrayList<MenuItem> menuItems;
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        new JsonTask(this).execute(JSON_URL);
    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();

        Type type = new TypeToken<ArrayList<MenuItem>>() {}.getType();
        menuItems = gson.fromJson(json, type);
        adapter = new MyAdapter(menuItems);
        recyclerView.setAdapter(adapter);
    }
}