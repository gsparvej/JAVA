
package userscanner;

import java.util.Scanner;


public class UserScanner {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st Number ");
        int number1=input.nextInt();
        System.out.println("Enter 2nd Number ");
        int number2=input.nextInt();
        
        float result=(float) number1/ number2;
        
        System.out.println("The Result is "+result);
    }
    
}
