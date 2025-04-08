
package learnstring;

import java.util.Scanner;


public class LearnString {

    
    public static void main(String[] args) {
       String message=" Welcome To Java ";

//        Scanner s=new Scanner(System.in);
//        System.out.println(" Enter A Name : ");
//        String message=s.nextLine();
        
        
        System.out.println(" length = "+message.length());
        System.out.println(" CharAt = "+message.charAt(8));
        System.out.println(" Concate = "+message.concat( " with parvej"));
        System.out.println(" Upper = "+message.toUpperCase());
        System.out.println(" Lower = "+message.toLowerCase());
        System.out.println(" Trim = "+message.trim());
        
        
        
        System.out.println(" Eguals = "+message.equals("java"));
        System.out.println(" Equals Ignore Case = "+message.equalsIgnoreCase("wElCome"));
        
        
        
    }
    
}
