package com.example.it396gprojekt_uppgiften;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {
    private EditText name, restaurant, cost;
    private Button lessThan, lessThanOrEqual, equal, greaterThanOrEqual, greaterThan;
    private String costSign = "";
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        preferences = getSharedPreferences("preferences", MODE_PRIVATE);
        editor = preferences.edit();

        lessThan = findViewById(R.id.less_than_Button);
        lessThan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                costSign = "<";
            }
        });

        lessThanOrEqual = findViewById(R.id.less_than_or_equal_Button);
        lessThanOrEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                costSign = "<=";
            }
        });

        equal = findViewById(R.id.equal_Button);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                costSign = "=";
            }
        });

        greaterThanOrEqual = findViewById(R.id.greater_than_or_equal_Button);
        greaterThanOrEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                costSign = "=>";
            }
        });

        greaterThan = findViewById(R.id.greater_than_Button);
        greaterThan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                costSign = ">";
            }
        });

        Button searchButton = findViewById(R.id.search_Button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = findViewById(R.id.name_EditText);
                String nameText = name.getText().toString();
                editor.putString("name", nameText);

                restaurant = findViewById(R.id.restaurant_EditText);
                String restaurantText = restaurant.getText().toString();
                editor.putString("restaurant", restaurantText);

                cost = findViewById(R.id.cost_EditText);
                String costText = cost.getText().toString();
                editor.putString("cost", costText);

                editor.putString("costSign", costSign);

                editor.apply();

                finish();
            }
        });
    }
}