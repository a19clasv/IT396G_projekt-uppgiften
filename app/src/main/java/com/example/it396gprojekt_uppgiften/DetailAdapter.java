package com.example.it396gprojekt_uppgiften;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private ArrayList<MenuItem> menuItems;
    private String ID;

    public  DetailAdapter(ArrayList<MenuItem> menuItems, String ID){
        this.menuItems = menuItems;
        this.ID = ID;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if(menuItems.get(position).getID().equals(ID)) {
            holder.nameTextView.setText("Name: " + menuItems.get(position).getName());
            holder.costTextView.setText("Cost: " + menuItems.get(position).getCost() + " kr");
            holder.restaurantTextView.setText("Restaurant: " + menuItems.get(position).getCompany());
        }
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }
}