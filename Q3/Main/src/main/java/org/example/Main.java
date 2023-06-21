package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature in fahrenheit : ");
        fahrenheit =  sc.nextFloat();

        celsius = ((float)5/9)*(fahrenheit-32);

        System.out.print("The Temperature in celsius : "+celsius);

    }
}