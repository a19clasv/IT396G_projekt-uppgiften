package com.example.it396gprojekt_uppgiften;

public class MenuItem {
    private String ID;
    private String login;
    private String name;
    private int cost;
    private String company;

    public MenuItem(String ID, String login, String name, int cost, String company) {
        this.ID = ID;
        this.login = login;
        this.name = name;
        this.cost = cost;
        this.company = company;
    }

    public String getID() {
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

    public String getCompany() {
        return company;
    }
}