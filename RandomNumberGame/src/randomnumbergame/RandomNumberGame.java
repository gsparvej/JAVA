
package randomnumbergame;

import java.util.Scanner;


public class RandomNumberGame {

   
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Please Guase a Number like 0 to 9 ");
        int n=number.nextInt();
        
        int randomNum = (int)(Math.random() * 10);
        System.out.println(randomNum+"");
        
        if(n==randomNum){
            System.out.println(" Congratulations - You are win ");
        }
        
        else{
            System.out.println(" SORRY You are Loose");
        }
    }
    
}
