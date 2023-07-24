package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            int num1 = 10;
            int[] arr = new int[5];

            arr[5] = 10; // Error :- Index 5 out of bounds for length 5.

            int num2 = num1/0; //Error :- A number cannot divide by 0.

        }catch(ArithmeticException e){ //before this catch block following catch block is getting run because this is the second error.
            System.out.println(e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){ // This catch block catch first error.
            System.out.println(e.getMessage());
        }

    }
}