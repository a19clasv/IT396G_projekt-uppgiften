package com.example.it396gprojekt_uppgiften;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView nameTextView, costTextView, restaurantTextView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.name_TextView);
        costTextView = itemView.findViewById(R.id.cost_TextView);
        restaurantTextView = itemView.findViewById(R.id.restaurant_TextView);
    }
}
