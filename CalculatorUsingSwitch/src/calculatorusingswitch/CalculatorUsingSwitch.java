
package calculatorusingswitch;

import java.util.Scanner;


public class CalculatorUsingSwitch {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println(" Enter 1st Number ");
        double n1=s.nextDouble();
        
        System.out.println(" Enter 2nd Number ");
        double n2=s.nextDouble();
        
        System.out.println("Enter your choices like as + - * / ");
        String sign=s.next();
        
        double result=0;
        
        
        switch (sign) {
            case "+":
                result=n1+n2;
                break;
            case "-":
                result=n1-n2;
                break;
            case "*":
                result=n1*n2;
                break;
            case "/":
                result=n1/n2;
                break;
            default:
                System.out.println(" Invalid Choices ");
        }
        
        System.out.println(result+"");
        
    }
    
}
