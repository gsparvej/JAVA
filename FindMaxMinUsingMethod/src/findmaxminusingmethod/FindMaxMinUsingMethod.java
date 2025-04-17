
package findmaxminusingmethod;

import java.util.Arrays;
import java.util.Scanner;


public class FindMaxMinUsingMethod {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Limit ");
        int limit = 0;
//        int limit=s.nextInt();
        int finale=findMaxMin(limit);
        System.out.println(finale+"");
        
    }
    
    
    public static int findMaxMin(int limit){
    
    
        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Limit ");
        int n=s.nextInt();
        int[] numbers=new int[n];
        int maxNumber=0;            // sir evabe kore dise ....
        int minNumber=999999999;
        int result = 0;
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
            result=maxNumber;
            }
            if(number<minNumber){
            minNumber=number;
            result=minNumber;
            }
        }
        System.out.println(" Max Number "+maxNumber);
        System.out.println(" Min Number "+minNumber);
    
    return result;
    }
    
}
