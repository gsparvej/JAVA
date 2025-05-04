

package banksystem.system;

import java.util.Scanner;



public class Account {
    
    private String accountNumber;
    private double balance;

    public Account() {
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void getDeposit(double amount){
        
    if(amount>0){
    balance+=amount;
      //  System.out.println(" "+amount +" is Deposited Successfully ! ");
        System.out.println("Check : "+balance);
    }
    else {
    
        System.out.println(" Invalid Choices ! ");
    }
      
    
    }
    
    public void getWithDraw(double amount){
    
        if(amount >balance || amount == balance+500){
        
            balance=balance-amount+500;
            System.out.println("You Must Pay 500 and your balance is "+balance);
        }
        else if(amount<=balance){
        
            balance=balance-amount;
            System.out.println("Present balance : "+balance);
        }
        else{
        
            System.out.println("Invalid choice ! ");
        }
    
    }
}
