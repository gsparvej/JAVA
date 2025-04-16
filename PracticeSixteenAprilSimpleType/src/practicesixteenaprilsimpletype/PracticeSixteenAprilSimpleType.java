
package practicesixteenaprilsimpletype;

import java.util.Scanner;


public class PracticeSixteenAprilSimpleType {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        
        // hour, minutes, seconds convert// start*****1
        
//        System.out.println("Enter Total Seconds ");
//        int totalSeconds=s.nextInt();
//        
//        int hour=totalSeconds/3600;
//        int remindSeconds=totalSeconds%3600;
//        int minutes=remindSeconds/60;
//        int seconds=remindSeconds%60;
//        
//        System.out.println(hour+" hours "+minutes+" minutes "+seconds+" seconds ");



    // current time start //******2


//        long totalMiliSeconds=System.currentTimeMillis();
//        System.out.println(totalMiliSeconds+" now total mili seconds ");
//        long totalSeconds=totalMiliSeconds/1000;
//        System.out.println(totalSeconds+" total seconds ");
//        long totalhour=totalSeconds/3600;
//        System.out.println(totalhour+"");
//        long remindSeconds=totalhour%3600;
//        System.out.println(remindSeconds+"");
//        long currentSeconds=totalSeconds%60;
//        long totaltminutes=totalSeconds/60;
//        long currentMinutes=totaltminutes%60;
//        long totalHour=totaltminutes/60;
//        long currentHour=totalHour%60;
//        long hour=((currentHour%12)+6)%12;
//        
//        
//        
//        System.out.println(hour+" hours "+currentMinutes+" minuts "+" "+currentSeconds+" seconds ");
//        System.out.println(hour+" : "+currentMinutes+" : "+" "+currentSeconds+" +GMT ");



        // Factorial using if and for loop start//****3


//        System.out.println("Enter a Number for Factorial ");
//        int f=s.nextInt();
//        int factorial=1;
//       
//        
//        
//        if(f<0){
//            System.out.println("Enter Greater Than Zero Or Positive Number ");
//            int userInput=s.nextInt();
//            
//            for(int i=1;i<=userInput;i++){
//        
//        factorial*=i;
//        }
//        System.out.println(factorial+"");
//       
//            
//        }
//        
//        else{
//        for(int i=1;i<=f;i++){
//        
//        factorial*=i;
//        }
//        System.out.println(factorial+"");
//        }




        //factorial using do while loop// start**** 3 or 
        
        System.out.println(" Enter a Number ");
        int n=s.nextInt();
        int count=1;
        int factorial=1;
        
        if (n<0){
            System.out.println("Enter positive or Greater Than zero value ");
            
            do{
            factorial*=count;
            count++;
            }
            while(count<=n);
            System.out.println(factorial+"");
            System.out.println(count+"");
        }
        
        
        
        
    }
    
}
