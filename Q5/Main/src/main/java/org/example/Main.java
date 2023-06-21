package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    static int[] arr = new int[20];
    static int count = 0;
    public static double avrage(){
        int i=0, sum=0;
        while(i<count){
            sum += arr[i];
            i++;
        }
        float avg = (float)sum/count;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        System.out.println("To stop entering numbers, Enter -1");
        while(count<20){
            System.out.print("Enter grade "+(count+1)+" : ");
            int input = sc.nextInt();
            if(input != -1)
                arr[count] = input;
            else
                break;
            count++;
        }

        String formattedAverage = decimalFormat.format(avrage());

        System.out.println("Average of grades : "+formattedAverage);

    }
}