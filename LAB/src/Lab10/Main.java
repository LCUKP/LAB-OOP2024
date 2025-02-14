/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author dtac6
 */
import Lab7_1.*;
public class Main {
    public static void main(String[] args) {
//      LAB10-1
        System.out.println("LAB10-1");
        Account a1 = new Account(5000, "Sommai");
        Account a2 = new Account(3000, "Somchai");
        Account a3 = new Account(900, "Somsri");
        
        Bank myBank = new Bank();
        myBank.addAccount(a1);
        myBank.addAccount(a2);
        myBank.addAccount(a3);
        
        System.out.println("Number of Account: " + myBank.getNumAccount());
        myBank.getAccount(0).showAccount();
        System.out.println("Deposit 500...");
        myBank.getAccount(0).deposit(500);
        myBank.getAccount(0).showAccount();
        System.out.println("Show all accounts");
        
        System.out.println("==============================");
        for (int i = 0; i < myBank.getNumAccount(); i++){
            myBank.getAccount(i).showAccount();
        }

//      LAB10-2
        System.out.println("------------------------------");
        System.out.println("LAB10-2");
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);

        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);

        System.out.println(cust);

        for(int i = 0; i < cust.getNumofAccount(); i++){
            cust.getAccount(i).showAccount();
        }
    }
}
