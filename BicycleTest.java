package com.company;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle bmx = new Bicycle(20.00,5.00,8.00);
        System.out.println(bmx);
        bmx.speedUp();
        Bicycle mountainBike = new Bicycle(20.00,5.00,8.00);
        System.out.println(mountainBike);
        mountainBike.applyBrake();
    }
}
