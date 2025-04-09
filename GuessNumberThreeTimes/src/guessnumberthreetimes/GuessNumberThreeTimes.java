
package guessnumberthreetimes;

import java.util.Scanner;


public class GuessNumberThreeTimes {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        
        int randomNumber=(int) (Math.random()*10);
        System.out.println(randomNumber+"");
        
        System.out.println(" Enter Your Number ");
        int userInput=s.nextInt();
        
        
        int count=1;
        
        while(count<3){
            
            if(randomNumber==userInput){
            System.out.println(" You Are Win ");
            break;
            }
            else if(randomNumber>userInput){
                System.out.println(" You Input Lower Number ");
                userInput=s.nextInt();
            }
            else if(randomNumber<userInput){
                System.out.println(" You Input Higher Number ");
                userInput=s.nextInt();
            }
            if(count==2){
                System.out.println(" Better Luck Next Time ");
            }
            
            
            count++;
        }
        
    }
    
}
