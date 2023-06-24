package org.example;

public class Ford extends Car{
    private int year, manufacturerDiscount;

    public Ford(int speed, double regularPrice,int year, int manufacturerDiscount ) {
        super(speed, regularPrice);
        this.year=year;
        this.manufacturerDiscount=manufacturerDiscount;
    }

    public double getSalePrice(){
        return regularPrice-manufacturerDiscount;
    }
}
