/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author ngobi
 * Create a class Account class with balance as data member. 
 * Create two constructors (no argument, and two arguments) and methods to withdraw and deposit balance.
 */
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
    Account a2 = new Account(45000);
    
    a1.deposit(45898.45);
    a2.withdraw(23900);
    }    
    
}

