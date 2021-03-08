/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author ngobi
 */
public class Account {
    double balance;
    Account(){
        balance = 0;
    }
    Account(double newBalance){
        balance = newBalance;
    }
    void withdraw(double amount){
        balance-=amount;
        System.out.println("You have withdraw "+amount+"\nNew balance is "+balance);
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("You have deposit "+amount+"\nNew balance is "+balance);
    }
    
}
