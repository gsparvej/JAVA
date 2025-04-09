
package squareroot;

import java.util.Scanner;


public class SquareRoot {

    
    public static void main(String[] args) {
        Scanner v= new Scanner(System.in);
        System.out.println("Enter A Number ");
        
        float n1=v.nextFloat();
        double result=Math.sqrt(n1);
        System.out.printf(result+" This is Square Root  %4.3f \n ",result);
    }
    
}
