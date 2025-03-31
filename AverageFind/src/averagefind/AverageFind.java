
package averagefind;

import java.util.Scanner;


public class AverageFind {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();
        float result=(float)(number1+number2+number3)/3;
        System.out.println(result+" Average of those numbers");
    }
    
}
