
package banksystem.system;


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
    public void getWithDraw(double amount) {
        super.getWithDraw(amount); 
        
    }
    
    
    
}
