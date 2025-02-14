/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

import Lab7_1.CheckingAccount;
import Lab7_1.Account;

/**
 *
 * @author dtac6
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;

    // Constructors
    public Customer() {
        this.firstName = "";
        this.lastName = "";
        this.acct = new Account[5];
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
    }

    public void addAccount(Account ac) {
        if (numOfAccount < acct.length) {
            acct[numOfAccount] = ac;
            numOfAccount++;
        }
    }
    
    public Account getAccount(int index) {
        return acct[index];
    }
    
    public int getNumofAccount() {
        return numOfAccount;
    }
    
    @Override
    public String toString() {
        if (acct == null){
            return firstName + " " + lastName + " doesn’t have account.";
        } 
        return "The " + firstName + " " + lastName + " has " + this.getNumofAccount() + " account" ;
    }

    public boolean equals(Customer c) {
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}