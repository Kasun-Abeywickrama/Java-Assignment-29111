package org.example;

public class Car {
    int speed;
    double regularPrice;

    public Car( int speed, double regularPrice){
        this.speed=speed;
        this.regularPrice=regularPrice;
    }
    String color;
    double  getSalePrice(){
        return regularPrice;
    }
}
