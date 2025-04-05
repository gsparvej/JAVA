
package calculateinterest;

import java.util.Scanner;


public class CalculateInterest {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Interest Rate Like as 12.5% ");
        double interestRate=s.nextDouble();
        double monthlyInterestRate=interestRate/1200;
        System.out.println("Enter Number of Year  ");
        int numberOfYear=s.nextInt();
        System.out.println("Enter Loan Amount ");
        double loanAmount=s.nextDouble();
        double monthlyPayment=loanAmount*monthlyInterestRate/ (1-1/Math.pow(1+monthlyInterestRate, numberOfYear*12));
        double totalPayment=monthlyPayment*numberOfYear*12;
        System.out.println("The Monthly Payment is "+monthlyPayment);
        System.out.println("The Total Payment is "+totalPayment);
        
        
        
        
        
    }
    
}
