
package areatraingle;

import java.util.Scanner;


public class AreaTraingle {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Base Value :");
        float base=input.nextFloat();
        System.out.println("Enter Height Value :");
        float height=input.nextFloat();
        double resultOfArea=(base*height)/2;
        System.out.println("The Area of This Traingle is : "+resultOfArea);
               
    }
    
}
