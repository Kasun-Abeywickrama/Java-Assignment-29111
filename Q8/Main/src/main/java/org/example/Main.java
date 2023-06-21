package org.example;

public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00f);
        SavingsAccount saver2 = new SavingsAccount(3000.00f);
        SavingsAccount.annualInterestRate = 4;

        saver1.calculateMonthlyInterest();
        System.out.println("New balance of saver1 : "+saver1.getSavingsBalance());

        saver2.calculateMonthlyInterest();
        System.out.println("New balance of saver2 : "+saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(5.00f);

        saver1.calculateMonthlyInterest();
        System.out.println("New balance of saver1 : "+saver1.getSavingsBalance());

        saver2.calculateMonthlyInterest();
        System.out.println("New balance of saver2 : "+saver2.getSavingsBalance());
    }
}