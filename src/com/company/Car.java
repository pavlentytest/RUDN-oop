package com.company;

public class Car {
    private String name; // null
    protected String color; // null
    private int maxspeed; // 0
    private double weight; // 0.0

    Car() {

    }

    Car(String name, String color, int maxspeed, double weight) {
        this.name = name;
        this.color = color;
        this.maxspeed = maxspeed;
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void doBeep() {
        System.out.println("Beep!!!");
    }

    public void doBeep(String s) {
        System.out.println("Car beep "+s);
    }


}
