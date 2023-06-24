package org.example;

public class Truck extends Car{
    private int weight;

    public Truck(int speed, double regularPrice,int weight) {
        super(speed, regularPrice);
        this.weight=weight;
    }

    public double getSalePrice(){
        if(weight>2000)
            return (regularPrice-(regularPrice*10/100));
        else
            return (regularPrice-(regularPrice*20/100));
    }

}
