package org.example;

public class Main {
    public static void main(String[] args) {

        //int [] arr = new int[-10]; //Error included statement

        //Error handled statement
        try {
            int [] arr = new int[-10];
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}