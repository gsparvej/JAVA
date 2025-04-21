
package classtestdate21april;

import java.util.Arrays;
import java.util.Scanner;


public class ClassTestDate21April {

    
    public static void main(String[] args) {
        
        
        // user will input price if price is more than 200 users will get 5% discount. output the Discount amount 
        // and actual price.
        
        
       
        
        Scanner s=new Scanner(System.in);
        
        
        // 3.
        System.out.println("Enter Five Numbers");
        int n=s.nextInt();
        int[] myNumbers=new int[n];
        
        int maxNumber=0;
        int minNumber=999999999;
        
        for(int index=0;index<n;index++){
        
            System.out.println("Input "+(index+1));
            int userInput=s.nextInt();
            myNumbers[index]=userInput;
        }
        System.out.println("My Numbers are "+Arrays.toString(myNumbers));
        
        
        for(int number : myNumbers){
        
            if(number>maxNumber){
            
                maxNumber=number;
            }
        }
        for(int number : myNumbers){
        
            if(number<minNumber){
            
                minNumber=number;
            }
        }
        System.out.println("Max Number Is : "+maxNumber);
        System.out.println("Min Number Is : "+minNumber);
        
        
         // 4.
        
//        System.out.println("Enter Price Of This Product ");
//        float n=s.nextFloat();
//        
//        if(n>200){
//        
//            System.out.println("Discount Amount is "+(200*0.05)+"\n"+" Actual Price is "+(n-(200*0.05)));
//        }
//        else{
//        
//            System.out.println("Discount Amount is "+(200*0)+"\n"+" Actual Price is "+(n-(200*0.05)));
//        }
        



    // 5.
    
    
        
    }
    
}
