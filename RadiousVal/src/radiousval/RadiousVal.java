package radiousval;

import java.util.Scanner;

public class RadiousVal {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        System.out.println(" Enter Radious ");
        float radious = r.nextFloat();
        
        if (radious <= 0) {
            System.out.println("Enter positve value of radious ");
            
            float radius = r.nextFloat();
            double result =  ( Math.PI * Math.pow(radius, 2));
            System.out.println("" + result);
        } else {
            double result2 = (Math.PI * Math.pow(radious, 2));
            System.out.println(" The Area Of " + result2);
        }

    }

}
