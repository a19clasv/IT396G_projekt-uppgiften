package com.example.it396gprojekt_uppgiften;

public class Dish {
    private Long ID;
    private String login;
    private String name;
    private String cost;
    private String course;
    private String restaurant;
    private String location;
    private int tip;

    public Dish(Long ID, String login, String name, String cost, String course, String restaurant, String location, int tip) {
        this.ID = ID;
        this.login = login;
        this.name = name;
        this.cost = cost;
        this.course = course;
        this.restaurant = restaurant;
        this.location = location;
        this.tip = tip;
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

    public String getCost() {
        return cost;
    }

    public String getCourse() {
        return course;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getLocation() {
        return location;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public String info(){
        String tmp=new String();
        tmp ="ID: " + getID() + ". Login: " + getLogin() + ". Name: " + getName() + ". Cost: " + getCost() +
                ". Course: " + getCourse() + "Restaurant" + getRestaurant() + "Location" + getLocation() + "Tip" + getTip();
        return  tmp;
    }
}
