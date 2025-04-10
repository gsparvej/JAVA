package learnmethod;

import java.util.Scanner;

public class LearnMethod {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Value ");

        int num = s.nextInt();

        String oddEven = findOddEven(num);
        String prime = doPrime(num);
        float root=squareRoot(num);

        System.out.println(oddEven + "");
        System.out.println(prime + "");
        System.out.println("Square Root of "+num+" is "+root);

    }

    public static String doPrime(int num1){
    
    
        int count=0;
        String result=" ";
     
        for(int i=1;i<=num1;i++){
            
               if(num1%i==0){
                   count++;
               }
        }
        
        if(count==2){
             result=num1+ " is a Prime Number ";
        }
        else{
          result=num1+ " is not  a Prime Number ";
        }
        
         return result;
         
         
        
         
        
    
    }
    
    // odd even by method //****start ****
    
    
    public static String findOddEven(int num) {

        String result = "";

        if (num % 2 == 0) {
            result = num + " it is an Even number";
        } else {
            result = num + " it is an Odd number";
        }

        return result;

    }
    
    
    
    
    
    // square Root Method //***** start
    
    
    
    
    public static float squareRoot(int num){
    
    float end;
    
    
    end=(float) Math.sqrt(num);
    
    return end;
        
    }
    
    
    
}
