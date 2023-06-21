package org.example;

public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;
    public static void modifyInterestRate(double aNR){
        annualInterestRate = aNR;
    }
    public SavingsAccount(double savingsBalance){
        this.savingsBalance=savingsBalance;
    }
    public void calculateMonthlyInterest(){
        double calculatedMonthlyInterest = savingsBalance*annualInterestRate/100/12;
        savingsBalance += calculatedMonthlyInterest;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
