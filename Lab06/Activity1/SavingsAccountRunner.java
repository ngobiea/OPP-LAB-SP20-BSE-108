package Lab06.Activity1;
/*Write a driver program to test class SavingsAccount. Instantiate two different objects of class 
SavingsAccount, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. 
Set the annualInterestRate to 3 percent. Then calculate the monthly interest and print the new 
balances for each of the savers.
Then set the annualInterestRate to 4 percent, calculate the next month's interest and print the 
new balances for each of the savers.*/
public class SavingsAccountRunner {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.03);
        System.out.println("Saver1 Montly interest:"+saver1.calculateMonthlyInterest());
        System.out.println("Saver2 Montly interest:"+saver2.calculateMonthlyInterest());
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Saver1 Montly interest:"+saver1.calculateMonthlyInterest());
        System.out.println("Saver2 Montly interest:"+saver2.calculateMonthlyInterest());
    }
}
