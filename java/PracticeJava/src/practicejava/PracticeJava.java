
package practicejava;

import java.util.Scanner;


public class PracticeJava {

    
    public static void main(String[] args) {
         Scanner val=new Scanner(System.in);
        float num1=val.nextFloat();
        float result=(float) (Math.pow(num1, 3.5));
        System.out.println(result+" Result");
    }
    
}
