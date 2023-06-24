package org.example;

public class Truk extends Car{

    private int weight;

    @Override
    double getSalePrice() {
        //If weight>2000,10%discount.Otherwise,20%discount.
                if(weight>2000)
        return 0;
    }
}
