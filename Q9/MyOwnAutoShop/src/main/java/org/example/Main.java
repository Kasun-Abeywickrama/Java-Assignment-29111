package org.example;

public class Main {
    public static void main(String[] args) {
        Sedan s1 = new Sedan(40,200000.00,30);
        Ford f1 = new Ford(30,250000,2019,10);
        Ford f2 = new Ford(40,350000,2022,5);
        Car c1 = new Car(80,300000);

        System.out.println("Speed of Sedan is "+s1.getSalePrice());
        System.out.println("Speed of Ford 1 is "+f1.getSalePrice());
        System.out.println("Speed of Ford 2 is "+f2.getSalePrice());
        System.out.println("Speed of Car is "+c1.getSalePrice());

    }
}