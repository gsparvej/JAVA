
package averagefind;

import java.util.Scanner;


public class AverageFind {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();
        double result=(number1+number2+number3)/3;
        System.out.println(result+" Average of those numbers");
    }
    
}
