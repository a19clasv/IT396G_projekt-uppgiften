package com.example.it396gprojekt_uppgiften;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private Button backButton;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a19clasv";
    private ArrayList<MenuItem> menuItems;
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;
    private String ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ID = extras.getString("ID");
        }

        backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
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
        adapter = new DetailAdapter(menuItems, ID);
        recyclerView.setAdapter(adapter);
    }
}