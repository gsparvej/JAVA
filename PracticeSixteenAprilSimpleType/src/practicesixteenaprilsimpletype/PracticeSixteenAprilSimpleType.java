
package practicesixteenaprilsimpletype;

import java.util.Scanner;


public class PracticeSixteenAprilSimpleType {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Total Seconds ");
        int totalSeconds=s.nextInt();
        
        int hour=totalSeconds/3600;
        int remindSeconds=totalSeconds%3600;
        int minutes=remindSeconds/60;
        int seconds=remindSeconds%60;
        
        System.out.println(hour+" hours "+minutes+" minutes "+seconds+" seconds ");
        
    }
    
}
