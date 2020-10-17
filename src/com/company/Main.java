package com.company;

public class Main {

    public static void main(String[] args) {

        // SOLID
        Car bmw = new Car("Bmw","Red",200,2000);
       // bmw.color = "Red";
        bmw.setColor("Red");
        System.out.println(bmw.getColor());

        Car opel = new Car();
        opel.setColor("Yellow");
        opel.doBeep();

        ECar tesla = new ECar("Tesla","Black",250,1500);
        tesla.getColor();
        tesla.color = "Blue";
        tesla.doBeep("123");

        double pressure = ECar.showPressure();
        int w = ECar.WHEELS;

       Math.PI

    }
}
