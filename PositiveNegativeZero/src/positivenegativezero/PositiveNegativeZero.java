
package positivenegativezero;

import java.util.Scanner;


public class PositiveNegativeZero {

    
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        
        System.out.println("To Check Its Positive , Negative or Zero   ");
        System.out.println("Enter A Number : ");
        
        float input=value.nextFloat();
        
        if(input>0){
            System.out.println(input+" Its a Positive Number ");
        }
        else if(input<0){
            System.out.println(input+" Its a Negative Number ");
        }
        else{
            System.out.println(input+" Its a Big Zero ");
        }
               
    }
    
}
