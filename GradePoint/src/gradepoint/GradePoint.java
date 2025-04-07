
package gradepoint;

import java.util.Scanner;


public class GradePoint {

    
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Your Result ");
        int result=r.nextInt();
        
        if(result>100){
            System.out.println("Please Enter Correct Result Below 100 ");
        }

        else if(result<=69){
            System.out.println("Your Grade is 'D' ");
        }
        else if(result<=79){
            System.out.println("Your Grade is 'C' ");
        }
        else if(result<=79){
            System.out.println("Your Grade is 'B' ");
        }
         else if(result<=100){
            System.out.println("Your Grade is 'A' ");
        }
        
        else {
            System.out.println("Your Grade is 'F' ");
        }
    }
    
}
