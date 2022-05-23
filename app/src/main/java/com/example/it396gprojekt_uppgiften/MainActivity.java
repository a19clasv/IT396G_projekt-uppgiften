package com.example.it396gprojekt_uppgiften;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private Button aboutButton, searchButton;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a19clasv";
    private ArrayList<MenuItem> menuItems;
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;
    private SharedPreferences preferences;
    private String name = "", restaurant = "", cost = "", costSign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("preferences", MODE_PRIVATE);

        aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        searchButton = findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();

        Type type = new TypeToken<ArrayList<MenuItem>>() {}.getType();
        menuItems = gson.fromJson(json, type);
        adapter = new MyAdapter(menuItems, MainActivity.this, name, restaurant, cost, costSign);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        name = preferences.getString("name", "");
        restaurant = preferences.getString("restaurant", "");
        cost = preferences.getString("cost", "");
        costSign = preferences.getString("costSign", "");

        new JsonTask(this).execute(JSON_URL);
    }
}