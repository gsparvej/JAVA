
package banksystem;

import banksystem.system.CurrentAccount;
import banksystem.system.SavingsAccount;


public class BankSystem {

   
    public static void main(String[] args) {
        
        SavingsAccount sa=new SavingsAccount();
        CurrentAccount cu=new CurrentAccount();
        
      // sa.setBalance(4500);
        sa.getDeposit(5000);
         cu.getWithDraw();
    }
    
}
