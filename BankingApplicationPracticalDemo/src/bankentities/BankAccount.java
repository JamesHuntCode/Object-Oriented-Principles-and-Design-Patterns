/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

/**
 *
 * @author James
 */
public class BankAccount {
    
    private int balance;
    private int overdraft;
    private String holder;
    
    public BankAccount(String accountHolder) {
        this.balance = 100;
        this.overdraft = 500;
        this.holder = accountHolder;
    }
    
    public void depositFunds(int amount) {
        this.balance += amount;
    }
    
    public boolean takeFunds(int amount) {
        if (this.balance - amount < 0)
        {
            return false;
        }
        else 
        {
            this.balance -= amount;
            return true;
        }
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    public int getOverdraft() {
        return this.overdraft;
    }
    
    public String getAccountHolder() {
        return this.holder;
    }
}
