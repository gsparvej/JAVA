
package practicehome;

import java.util.Scanner;

public class PracticeHome {

    
    public static void main(String[] args) {
        Scanner power=new Scanner(System.in);
        System.out.println("Enter m's value ");
       float m=power.nextFloat();
        System.out.println("Enter r's value ");
       float r=power.nextFloat();
        float result= (float) (m*Math.pow(r, 2));
        System.out.println(result+" Is Your Result ");
        
    }
    
}
