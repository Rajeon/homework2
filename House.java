package com.company;

public class House {
    private int windows;

//    Constructor
    public House(int windows){
        this.windows = windows;
    }
//Return
    public int getWindows() {
        return windows;
    }
//Set Value Wanna Get To
    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void howManyWindows(){
        System.out.println(windows);
    }
//    method
    public void sellHouse(double priceToPay){
        System.out.println("you said you wanted to pay " + priceToPay);
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                '}';
    }
}
