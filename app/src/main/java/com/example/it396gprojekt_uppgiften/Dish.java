package com.example.it396gprojekt_uppgiften;

public class Dish {
    private Long ID;
    private String login;
    private String name;
    private String cost;
    private String course;
    private int tip;

    public Dish(Long ID, String login, String name, String cost, String course, int tip) {
        this.ID = ID;
        this.login = login;
        this.name = name;
        this.cost = cost;
        this.course = course;
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

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public String info(){
        String tmp=new String();
        tmp ="ID: " + getID() + ". Login: " + getLogin() + ". Name: " + getName() + ". Cost: " + getCost() + ". Course: " + getCourse() + "Tip" + getTip();
        return  tmp;
    }
}
