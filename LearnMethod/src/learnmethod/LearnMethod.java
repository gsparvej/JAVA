
package learnmethod;

import java.util.Scanner;


public class LearnMethod {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Value ");
        int num1=s.nextInt();
        
        String result=doPrime(num1);
        
        System.out.println(result);
        
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
}
