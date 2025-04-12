
package learnmethodoverloading;

import java.util.Arrays;
import java.util.Scanner;


public class LearnMethodOverLoading {

   
    public static void main(String[] args) {
        
        
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter how many number u want to input ");
        int n=s.nextInt();
        
        int[] myArray=new int[n];
        for(int i=0;i<n;i++){
        
            System.out.println("Enter Numbers ");
            int userInput=s.nextInt();
            myArray[i]=userInput;
        }
        sum(myArray);
        
        
        
        
        int result1=sum();
        System.out.println(result1+" fixed value result ");
        
        
        System.out.println("Enter a's value ");
        int a=s.nextInt();
        int result2=sum(a); // this is method called//
        System.out.println(result2+"");
        
        System.out.println(" Enter b's value ");
        int b =s.nextInt();
        System.out.println(" Enter c's value ");
        int c=s.nextInt();
        
        int result3=sum(b, c);
        System.out.println(result3+"");
        
        
    }
    
    
    public static int sum(){
    
    return 10+20;
    
    }
    public static int sum(int a){
    
    return a+20;
    
    }
    public static int sum(int b,int c){
       
    
    return b+c;
    
    }
    
    public static void sum(int...a){
    
    int sum=0;
    for(int item :a){
        sum+=item;
    }
    
        System.out.println(Arrays.toString(a));
        System.out.println(sum+"");
    }
    
    
}
