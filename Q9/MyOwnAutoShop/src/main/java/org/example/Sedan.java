package org.example;

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice,int length){
        super(speed,regularPrice);
        this.length=length;
    }
    @Override
    double getSalePrice() {
        if(length>20f)
            return (regularPrice-(regularPrice*5/100));
        else
            return (regularPrice-(regularPrice*10/100));
    }
}
