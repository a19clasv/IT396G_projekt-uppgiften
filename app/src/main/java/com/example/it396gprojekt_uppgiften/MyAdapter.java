package com.example.it396gprojekt_uppgiften;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private ArrayList<MenuItem> menuItems;
    private Context context;
    private String nameFilter, restaurantFilter, costFilter, costSignFilter;

    public MyAdapter(ArrayList<MenuItem> menuItems, Context context, String nameFilter, String restaurantFilter, String costFilter, String costSignFilter) {
        this.menuItems = menuItems;
        this.context = context;
        this.nameFilter = nameFilter;
        this.restaurantFilter = restaurantFilter;
        this.costFilter = costFilter;
        this.costSignFilter = costSignFilter;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if ((nameFilter.equals("") || nameFilter.equals(menuItems.get(position).getName())) && (restaurantFilter.equals("") || restaurantFilter.equals(menuItems.get(position).getCompany()))){
            if (!costFilter.equals("")){
                try{
                    int cost = Integer.parseInt(costFilter);
                    if (costSignFilter.equals("<")){
                        if (cost > menuItems.get(position).getCost()){
                            holder.nameTextView.setText("Name: " + menuItems.get(position).getName());
                            holder.nameTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                            holder.restaurantTextView.setText("Restaurant: " + menuItems.get(position).getCompany());
                            holder.restaurantTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                        }
                    }
                    else if (costSignFilter.equals("<=")){
                        if (cost >= menuItems.get(position).getCost()){
                            holder.nameTextView.setText("Name: " + menuItems.get(position).getName());
                            holder.nameTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                            holder.restaurantTextView.setText("Restaurant: " + menuItems.get(position).getCompany());
                            holder.restaurantTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                        }
                    }
                    else if (costSignFilter.equals("=")){
                        if (cost == menuItems.get(position).getCost()){
                            holder.nameTextView.setText("Name: " + menuItems.get(position).getName());
                            holder.nameTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                            holder.restaurantTextView.setText("Restaurant: " + menuItems.get(position).getCompany());
                            holder.restaurantTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                        }
                    }
                    else if (costSignFilter.equals("=>")){
                        if (cost <= menuItems.get(position).getCost()){
                            holder.nameTextView.setText("Name: " + menuItems.get(position).getName());
                            holder.nameTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                            holder.restaurantTextView.setText("Restaurant: " + menuItems.get(position).getCompany());
                            holder.restaurantTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                        }
                    }
                    else if (costSignFilter.equals(">")){
                        if (cost < menuItems.get(position).getCost()){
                            holder.nameTextView.setText("Name: " + menuItems.get(position).getName());
                            holder.nameTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                            holder.restaurantTextView.setText("Restaurant: " + menuItems.get(position).getCompany());
                            holder.restaurantTextView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(context, DetailActivity.class);
                                    intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                                    context.startActivity(intent);
                                }
                            });
                        }
                    }
                }catch(Exception e){
                    holder.nameTextView.setText("Name: " + menuItems.get(position).getName());
                    holder.nameTextView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(context, DetailActivity.class);
                            intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                            context.startActivity(intent);
                        }
                    });
                    holder.restaurantTextView.setText("Restaurant: " + menuItems.get(position).getCompany());
                    holder.restaurantTextView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(context, DetailActivity.class);
                            intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                            context.startActivity(intent);
                        }
                    });
                }
            }else {
                holder.nameTextView.setText("Name: " + menuItems.get(position).getName());
                holder.nameTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context, DetailActivity.class);
                        intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                        context.startActivity(intent);
                    }
                });
                holder.restaurantTextView.setText("Restaurant: " + menuItems.get(position).getCompany());
                holder.restaurantTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context, DetailActivity.class);
                        intent.putExtra("ID", menuItems.get(holder.getAdapterPosition()).getID());
                        context.startActivity(intent);
                    }
                });
            }
        }
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }
}