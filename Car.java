package com.company;

public class Car {
    private int tire;
    private int windows;

    public Car(int tire, int windows){
        this.tire = tire;
        this.windows = windows;

    }
    public void howManyWindows(){
        System.out.println(windows);
        howManyTires();
    }

    private void howManyTires(){
        System.out.println(tire);

    }

}
