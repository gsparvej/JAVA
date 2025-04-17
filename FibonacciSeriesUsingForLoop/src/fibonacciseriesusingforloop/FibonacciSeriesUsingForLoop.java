
package fibonacciseriesusingforloop;

import java.util.Scanner;


public class FibonacciSeriesUsingForLoop {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Limit");
        int input=s.nextInt();
        
        int number1=0;
        int number2=1;
        int sum=0;
        int fibonacci=1;
        System.out.println("----------");
        System.out.print(number1+" ");
        System.out.print(number2+" ");
        
        for(int i=3;i<=input;i++){
            
        fibonacci*=i;
        sum=number1+number2;
        number1=number2;
        number2=sum;
        
            System.out.print(sum+" ");
        }
        
        
    }
    
}
