

package banksystem.system;

import java.util.Scanner;



public class SavingsAccount extends Account{
    
    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void getDeposit(double amount) {
         
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Account No : ");
        
        setAccountNumber(s.next());
     //   String accNo=s.next();
        System.out.print("Enter Acount Holder Name : ");
        String name=s.next();
        System.out.print("Deposit Amount : ");
        double dep=s.nextDouble();
        System.out.println(dep+" is Deposited Successfully ! ");
        dep+=amount;
          super.getDeposit(amount);
          System.out.println("---------------------------");
          System.out.println("Account Holder Name : "+name);
          System.out.println("Your Account No is : "+getAccountNumber());
          System.out.println("After Deposit Your Balance is : "+dep);
    }

     
    
}
