
package convertminute;

import java.util.Scanner;


public class ConvertMinute {

    
    public static void main(String[] args) {
//        Scanner value=new Scanner(System.in);
//        int num1=value.nextInt();
//        int result1=num1/60;
//        int result2=result1/60;
//        int result3=result2%60;
//        System.out.println(result1+"hour");



Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Seconds");
        
        int totalSeconds=scanner.nextInt();
        int hours=totalSeconds/3600; 
        int remainSeconds=totalSeconds%3600;
        int minutes=remainSeconds/60;
        int seconds=remainSeconds%60;
       
        System.out.println(hours+"hours,"+minutes+"minutes,"+seconds+"seconds");
        
    }
    
}
