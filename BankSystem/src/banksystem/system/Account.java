

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
    
    public void getWithDraw(){
        Scanner s =new Scanner(System.in);
        System.out.print("How Much You Withdraw : ");
    double amount=s.nextDouble();
    balance=getBalance();
        if(amount>0 && balance>=amount){
        
            balance-=amount;
            System.out.println(amount+" is Withdrawn Successfully ! ");
        }
       else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    
    }
}
