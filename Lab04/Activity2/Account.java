/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04.Activity2;

/**
 *
 * @author ngobi
 * Create an Encapsulated class Account class with balance as data member. 
 * Create two constructors and methods to withdraw and deposit balance. 
 * In the runner create two accounts. The second account should be created with the same balance as first account. 
 * (hint: use get function )
 */
public class Account {
    private double balance;
    Account (){
        this.balance = 0.0;
    }
    Account(double balance){
        this.balance = balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void withdraw(double amount){
        this.balance -=amount;
        System.out.println("Amount Withdrew: " + amount+"\nCurrent Balance: " + this.balance);

    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Amount Deposited: " + amount+"\nCurrent Balance: " + this.balance);
    }
}
