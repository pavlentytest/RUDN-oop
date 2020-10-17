package com.company;

public class ECar extends Car {

    public static final int WHEELS = 4;

    ECar(String name, String color, int maxspeed, double weight) {
        // вызов конструктора родителя
        super(name, color, maxspeed, weight);
        this.color = "Mega " + this.color;
    }

    public static double showPressure() {
        //  вычисления
        return 89.3;
    }

    @Override
    public void doBeep() {
        super.doBeep();
    }

    public void doBeep(String sound) {
        //super.doBeep();
        System.out.println("Tesla "+sound);
    }
}
