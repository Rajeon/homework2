package com.company;

public class Triangle {
    public float a;
    public float b;
    public float c;


    public Triangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public void calculatePerimeter(){
        System.out.println(a + b + c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
