
package leapyeartest;

import java.util.Scanner;


public class LeapYearTest {

   
    public static void main(String[] args) {
        Scanner year=new Scanner(System.in);
        System.out.println("Enter a Year");
        int input=year.nextInt();
        if(input%4==0 && !(input%100==0)){
            System.out.println(input+" is a Leap Year");
        }
        else if(input%400==0){
            System.out.println(input+" is a Leap Year");
        }
        else{
            System.out.println(input+" is Not a Leap Year");
        }
    }
    
}
