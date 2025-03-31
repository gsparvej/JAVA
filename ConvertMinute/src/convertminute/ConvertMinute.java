
package convertminute;

import java.util.Scanner;


public class ConvertMinute {

    
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter Seconds");
       int num1=value.nextInt();
        int minutes=num1/60; // minutes
       int remainingSeconds=num1%60; // seconds 
        
        System.out.println(num1+" Seconds is " +minutes+ " minutes " +remainingSeconds+" seconds ");



//Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Seconds");
//        
//        int totalSeconds=scanner.nextInt();
//        int hours=totalSeconds/3600; 
//        int remainSeconds=totalSeconds%3600;
//        int minutes=remainSeconds/60;
//        int seconds=remainSeconds%60;
//       
//        System.out.println(hours+"hours,"+minutes+"minutes,"+seconds+"seconds");
        
    }
    
}
