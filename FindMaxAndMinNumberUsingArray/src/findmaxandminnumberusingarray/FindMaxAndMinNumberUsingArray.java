
package findmaxandminnumberusingarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class FindMaxAndMinNumberUsingArray {

  
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Limit ");
        int n=s.nextInt();
        int[] numbers=new int[n];
        int maxNumber=0;            // sir evabe kore dise ....
        int minNumber=999999999;
//        System.out.println(numbers.toString()+" ");
        
        for(int i=0;i<n;i++){
        
            System.out.println("Enter number "+(i+1));    
            int userInput=s.nextInt();
            numbers[i]=userInput;
        }
        System.out.println("My Numbers are "+Arrays.toString(numbers));
        
        for(int number : numbers){
        
            if(number>maxNumber){
            maxNumber=number;
            }
            if(number<minNumber){
            minNumber=number;
            }
        }
        System.out.println(" Max Number "+maxNumber);
        System.out.println(" Min Number "+minNumber);
        
    }
    
}
