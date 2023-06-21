package org.example;

public class Main {
    public static void main(String[] args) {
        Monster m1 = new Monster(1234,"This is the description");
        System.out.println("The location : "+m1.getLocation());
        System.out.println("The description : "+m1.getDescription());
    }
}