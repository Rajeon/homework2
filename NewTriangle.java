package com.company;

public class NewTriangle {
    private float a;
    private float b;
    private float c;

    public NewTriangle(){

    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void NewTriangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void calculatePerimeter(){
        System.out.println(a + b + c);
    }

    @Override
    public String toString() {
        return "NewTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
