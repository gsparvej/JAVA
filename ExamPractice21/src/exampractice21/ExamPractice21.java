
package exampractice21;

import java.util.Arrays;
import java.util.Scanner;


public class ExamPractice21 {

    
    public static void main(String[] args) {
        
        // bubble sort start........ 1
        
        Scanner s=new Scanner(System.in);
        
        
        System.out.println("Enter Your Array Size for Sorting");
        int n=s.nextInt();
        int[] myNumbers=new int[n];
        
        for(int index=0;index<n;index++){
        
            System.out.println("Enter "+(index+1));
            int userInput=s.nextInt();
            myNumbers[index]=userInput;
            
            
        }
        System.out.println("Before Sorting : "+Arrays.toString(myNumbers));
        
        
        for(int i=0;i<myNumbers.length;i++){
        
            for(int j=0;j<myNumbers.length-i-1;j++){
            
                if(myNumbers[j]>myNumbers[j+1]){
                
                    int temp=myNumbers[j];
                    myNumbers[j]=myNumbers[j+1];
                    myNumbers[j+1]=temp;
                    
                }
            
            }
        
        }
        System.out.println("After Sorting : "+Arrays.toString(myNumbers));
        
        
        // discount start........ 2
        
//        System.out.println("Enter Price Of This Product ");
//        float n=s.nextFloat();
//        
//        float discount;
//        float actualPrice;
//        
//        if(n>200){
//        
//            discount=n*0.05f;
//            actualPrice=n-discount;
//            System.out.println("Discount is :"+discount+"\n"+" Now You Pay "+actualPrice);
//        }
//        else{
//            discount=n*0.05f;
//            actualPrice=n-discount;
//            System.out.println("Discount is :"+discount+"\n"+" Now You Pay "+actualPrice);
//        }


            // 
        
        
        
        
        
    }
    
}
