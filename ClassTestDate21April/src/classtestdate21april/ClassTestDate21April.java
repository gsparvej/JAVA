
package classtestdate21april;

import java.util.Arrays;
import java.util.Scanner;


public class ClassTestDate21April {

    
    public static void main(String[] args) {
        
        
        // user will input price if price is more than 200 users will get 5% discount. output the Discount amount 
        // and actual price.
        
        
       
        
        Scanner s=new Scanner(System.in);
        
        // 1.
        
//        System.out.println("enter number limit for fibonacci ");
//        int n=s.nextInt();
//        
//        int num1=0;
//        int num2=1;
//        int sum=0;
//        System.out.println("----------");
//        System.out.print(num1+" ");
//        System.out.print(num2+" ");
//        
//        for(int i=3;i<=n;i++){
//        
//            sum=num1+num2;
//            num1=num2;
//            num2=sum;
//            
//            System.out.print(""+sum+" ");
//        }
        
    //2. 
    
//        System.out.println("Enter a number to check its Prime Or Not ");
//        int n=s.nextInt();
//        int count=0;
//        
//        for(int i=1;i<=n;i++){
//        
//            if(n%i==0){
//            
//                count++;
//            }
//            
//        }
//        if(count==2){
//        
//            System.out.println("Its Prime Number ");
//        }
//        else{
//        
//            System.out.println("Its Not Prime Number ");
//        }
        
        
        
        
        
        
        // 3.
        
        
//        System.out.println("Enter Five Numbers");
//        int n=s.nextInt();
//        int[] myNumbers=new int[n];
//        
//        int maxNumber=0;
//        int minNumber=999999999;
//        
//        for(int index=0;index<n;index++){
//        
//            System.out.println("Input "+(index+1));
//            int userInput=s.nextInt();
//            myNumbers[index]=userInput;
//        }
//        System.out.println("My Numbers are "+Arrays.toString(myNumbers));
//        
//        
//        for(int number : myNumbers){
//        
//            if(number>maxNumber){
//            
//                maxNumber=number;
//            }
//        }
//        for(int number : myNumbers){
//        
//            if(number<minNumber){
//            
//                minNumber=number;
//            }
//        }
//        System.out.println("Max Number Is : "+maxNumber);
//        System.out.println("Min Number Is : "+minNumber);
        
        
         // 4.
        
        System.out.println("Enter Price Of This Product ");
        float n=s.nextFloat();
        
        if(n>200){
        
            System.out.println("Discount Amount is "+(n*0.05)+"\n"+" Actual Price is "+(n-(n*0.05)));
        }
        else{
        
            System.out.println("Discount Amount is "+(n*0)+"\n"+" Actual Price is "+n);
        }
        



    // 5.
    
    
//     System.out.println("Enter Five Numbers");
//        int n=s.nextInt();
//        int[] myNumbers=new int[n];
//        
//       
//        
//        for(int index=0;index<n;index++){
//        
//            System.out.println("Input "+(index+1));
//            int userInput=s.nextInt();
//            myNumbers[index]=userInput;
//        }
//        System.out.println("My Numbers are Before Sorting "+Arrays.toString(myNumbers));
//        
//        for(int i=0;i<myNumbers.length;i++){
//        
//            for(int j=0;j<myNumbers.length-i-1;j++){
//            
//                if(myNumbers[j]>myNumbers[j+1]){
//                
//                    int temp=myNumbers[j];
//                    myNumbers[j]=myNumbers[j+1];
//                    myNumbers[j+1]=temp;
//                    
//                }
//            }
//        }
//        System.out.println("My Numbers are After Sorting "+Arrays.toString(myNumbers));
        
        
       
        
        
        
        
        
    }
    
}
