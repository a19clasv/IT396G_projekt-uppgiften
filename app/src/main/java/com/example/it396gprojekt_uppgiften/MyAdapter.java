package com.example.it396gprojekt_uppgiften;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private ArrayList<MenuItem> menuItems;

    public  MyAdapter(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameTextView.setText("Name: " + menuItems.get(position).getName());
        holder.costTextView.setText("Cost: " + menuItems.get(position).getCost());
        holder.restaurantTextView.setText("Restaurant: " + menuItems.get(position).getRestaurant());
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }
}