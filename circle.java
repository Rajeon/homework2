package com.company;

public class circle {
    public int radius = 10;
    double Area;

    public circle(int g){
      this.radius = g;


    }
    public void calculateArea(){
        double Area = Math.PI * (radius * radius);
        System.out.println("Area of circle: " + Area);
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                '}';
    }
}

