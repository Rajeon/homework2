package com.company;

public class NewCircle {
    private int radius;

    public NewCircle(){

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void NewCircle(int radius){
        this.radius = radius;
    }
    public void calculateArea(){
        double Area = Math.PI * (radius * radius);
        System.out.println("area of circle " + Area);
    }

    @Override
    public String toString() {
        return "NewCircle{" +
                "radius=" + radius +
                '}';
    }
}
