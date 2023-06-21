package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n1, n2, n3, sum , product, smallest=0, largest=0;
        float avrage;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 01 : ");
        n1 = sc.nextInt();
        System.out.print("Enter the number 02 : ");
        n2 = sc.nextInt();
        System.out.print("Enter the number 03 : ");
        n3 = sc.nextInt();

        sum = n1+n2+n3;
        avrage = (float)(n1+n2+n3)/3;
        product = n1*n2*n3;

        if(n1<n2){
            if(n1<n3)
                smallest = n1;
            else if(n3<n1)
                smallest = n3;
        }else if(n2<n1){
            if(n2<n3)
                smallest = n2;
            else if(n3<n2)
                smallest = n3;
        }

        if(n1>n2){
            if(n1>n3)
                largest = n1;
            else if(n3>n1)
                largest = n3;
        }else if(n2>n1){
            if(n2>n3)
                largest = n2;
            else if(n3>n2)
                largest = n3;
        }

        System.out.println("The sum of these three numbers : "+sum);
        System.out.println("The average of these three numbers : "+avrage);
        System.out.println("The product of these three numbers : "+product);
        System.out.println("The Smallest number of these three numbers : "+smallest);
        System.out.println("The Largest number of these three numbers : "+largest);
    }
}