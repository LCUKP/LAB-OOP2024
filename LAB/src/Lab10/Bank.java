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
public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank() {
        acct = new Account[10];
        numAcct = 0;
    }
    
    public void addAccount(Account ac) {
        if (numAcct < acct.length) {
            acct[numAcct] = ac;
            numAcct++;
        }
    }
    
    public Account getAccount(int index) {
        return acct[index];
    }
    
    public int getNumAccount() {
        return numAcct;
    }
}
