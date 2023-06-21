package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Inserting Numbers (Input)
        int n1, n2, n3, product;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number 01 : ");
        n1=sc.nextInt();
        System.out.print("Enter The number 02 : ");
        n2=sc.nextInt();
        System.out.print("Enter The number 03 : ");
        n3=sc.nextInt();

        //Processing numbers (Process)
        product = n1*n2*n3;

        //printing final result (Output)
        System.out.println("Product of these three numbers : "+product);
    }
}