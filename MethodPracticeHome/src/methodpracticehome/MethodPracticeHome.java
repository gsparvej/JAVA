
package methodpracticehome;

import java.util.Scanner;


public class MethodPracticeHome {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter a Number ");
        int input=s.nextInt();
        
        
        String oddEven=findOddEven(input);
        System.out.println(oddEven+ "");
        
        
        
        //  positive negative zero 
        
        System.out.println(" To check Its Negative / positive or zero ");
        System.out.println("Enter a Number ");
        float n=s.nextFloat();
        
        String positiveNegativ=findNegativePositiveZero((int) n);
        System.out.println(positiveNegativ+"");
        
        
        
        
        System.out.println("Enter Day ");
        int day=s.nextInt();
        
        System.out.println(" Enter Month ");
        int month=s.nextInt();
        
        System.out.println(" Enter Year ");
        int year=s.nextInt();
        
        String view=doDateMonthYear(day, month, year);
        System.out.println(view+"");
        
        
        
    }
    
    
    public static String findOddEven(int input){
    
    String result;
    
    if(input%2==0){
            result=input+" it is an Even number";
        }
        else{
            result=input+" it is an Odd number";
        }
    
    
    return result;
    
    }
    
    
    //positive negative zero find with METHOD//****** start****
    
    public static String findNegativePositiveZero(int n){
    
    String output;
    
    if(n>0){
        output= n+" It is Positive Number ";
    }
    else if(n<0){
        output= n+" It is Negative Number ";
    }
    else {
        output= n+" It is a Zero Number ";
    }
    
    
    return output;
    
    
    }
    
    
    
    
    
    
    
    public static String doDateMonthYear(int day, int month, int year){
    
    String result;
    
    
    
    result=day+","+month+" ,"+year;
    
    return result;
    
    
    }
    
    
    
}
