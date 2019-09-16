package com.company;

public class Bicycle {
    public double speed;
    public double cadence;
    public double gear;

    public Bicycle (double speed, double cadence, double gear){
        this.speed = speed;
        this.cadence = cadence;
        this.gear = gear;
    }
    public void speedUp(){
        System.out.println(speed + speed);
    }
    public void applyBrake(){
        System.out.println(gear - speed);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                ", cadence=" + cadence +
                ", gear=" + gear +
                '}';
    }
}
