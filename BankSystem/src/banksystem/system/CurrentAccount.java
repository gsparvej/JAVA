
package banksystem.system;

import java.util.Scanner;


public class CurrentAccount extends Account{
    
    private double overLimitDraft;

    public CurrentAccount() {
    }

    public CurrentAccount(double overLimitDraft) {
        this.overLimitDraft = overLimitDraft;
    }

    public CurrentAccount(double overLimitDraft, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.overLimitDraft = overLimitDraft;
    }

    public double getOverLimitDraft() {
        return overLimitDraft;
    }

    public void setOverLimitDraft(double overLimitDraft) {
        this.overLimitDraft = overLimitDraft;
    }

    @Override
    public void getWithDraw() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Withdrawn Amount : ");
        double withdraw=s.nextDouble();
       double amount=getBalance();
        super.getWithDraw(); 
        
       double balance=getBalance()-withdraw;
        System.out.println(" "+balance);
        
    }

    
}
