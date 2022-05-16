package com.example.it396gprojekt_uppgiften;

public class MenuItem {
    private Long ID;
    private String login;
    private String name;
    private int cost;
    private String restaurant;

    public MenuItem(Long ID, String login, String name, int cost, String restaurant) {
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
}