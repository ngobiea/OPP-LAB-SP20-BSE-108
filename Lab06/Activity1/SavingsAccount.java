package Lab06.Activity1;
/*
 Create a SavingsAccount class.
 Use a static data member annualInterestRate to store the annual interest rate for each of the savers. 
 Each member of the class contains a private data member savingsBalance indicating the amount the saver currently hason deposit. 
 Provide member function calculateMonthlyInterest that calculates the monthly interest 
 by multiplying the balance by annualInterestRate divided by 12; 
 this interest should be added to savingsBalance. 
 Provide a static member function modifyInterestRate that sets the static annualInterestRate to a new value.
 */
public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public double calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * annualInterestRate)/ 12;
        return savingsBalance;
    }
    public static void modifyInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
}
