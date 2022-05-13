package com.example.it396gprojekt_uppgiften;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public EditText editText;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.dish_TextView);
        editText = itemView.findViewById(R.id.dish_EditText);
    }
}
