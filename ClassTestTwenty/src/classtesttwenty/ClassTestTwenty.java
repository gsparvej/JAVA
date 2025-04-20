
package classtesttwenty;

import java.util.Arrays;
import java.util.Scanner;


public class ClassTestTwenty {

   
    public static void main(String[] args) {
        
        
        //1. Fibonacci ..............
        
        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Fibonacci Limit ");
//        int n=s.nextInt();
//        
//        int num1=0;
//        int num2=1;
//        int sum=0;
//        int fibonacci=1;
//        System.out.print(""+num1+" ");
//        System.out.print(""+num2+" ");
//        for(int i=3;i<=n;i++){
//        
//            fibonacci*=i;
//            sum=num1+num2;
//            num1=num2;
//            num2=sum;
//            
//            System.out.print(""+sum+" ");
//        }



// 2. Prime Number Test...........

//        System.out.println("To Check Prime Or Not ");
//        System.out.println("Enter A number : ");
//        
//        int input=s.nextInt();
//        int count=0;
//        
//        for(int i=1;i<=input;i++){
//        
//            if(input%i==0){
//            
//            count++;
//            }
//           
//        }
//        if(count==2){
//            System.out.println("Its Prime ");
//        }
//        else{
//         System.out.println("Its Not Prime ");
//        }





// 3. Max-Min among Five Numbers Using Array ........



        System.out.println("Enter Your Array Size ");
        int size=s.nextInt();
        
        int[] myArray=new int[size];
        
        int maxNumber=0;
        int minNumber=999999999;
        
        for(int index=0;index<size;index++){
            System.out.println("Enter "+(index+1)+" number ");
            int userInput=s.nextInt();
            myArray[index]=userInput;
        
        }
        System.out.println(Arrays.toString(myArray));
        
        System.out.println("------------------");
        
        for(int number: myArray){
        
            if(number>maxNumber){
            maxNumber=number;
            
            }
        
        }
        
        for(int number : myArray){
            
            if(number<minNumber){
            
                minNumber=number;
            }
        
        
        }
        System.out.println(" Max Number is "+maxNumber);
        System.out.println(" Min Number is "+minNumber);
        
       
        
    }
    
}
