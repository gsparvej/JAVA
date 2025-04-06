
package largestnumber;

import java.util.Scanner;


public class LargestNumber {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Check Largest Number ");
        System.out.println(" Please Enter 1st Number : ");
        
        float number1=input.nextFloat();
        System.out.println(" Please Enter 2nd Number : ");
        float number2=input.nextFloat();
        
        if(number1>number2){
            System.out.println(number1+" Its a Largest Number ");
        }
        else{
            System.out.println(number2+" Its a Largest Number ");
        }
    }
    
}
