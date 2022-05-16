package com.example.it396gprojekt_uppgiften;

public class Dish {
    private Long ID;
    private String login;
    private String name;
    private int cost;
    private String restaurant;

    public Dish(Long ID, String login, String name, int cost, String restaurant) {
        this.ID = ID;
        this.login = login;
        this.name = name;
        this.cost = cost;
        this.restaurant = restaurant;
    }

    public Long getID() {
        return ID;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String info(){
        String tmp=new String();
        tmp ="ID: " + getID() + ". Login: " + getLogin() + ". Name: " + getName() + ". Cost: " + getCost() + "Restaurant" + getRestaurant();
        return  tmp;
    }
}
