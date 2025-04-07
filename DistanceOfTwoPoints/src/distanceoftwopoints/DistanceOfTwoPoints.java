
package distanceoftwopoints;

import java.util.Scanner;


public class DistanceOfTwoPoints {

    
    public static void main(String[] args) {
        Scanner points=new Scanner(System.in);
        System.out.println("Enter Coordinates Of 1st Point of (x-axis) ");
        int x1=points.nextInt();
        
        System.out.println("Enter Coordinates Of 1st Point of (y-axis) ");
        int y1=points.nextInt();
        
        System.out.println("Enter Coordinates Of 2nd Point of (x-axis) ");
        int x2=points.nextInt();
        
        System.out.println("Enter Coordinates Of 2nd Point of (y-axis) ");
        int y2=points.nextInt();
        
        int result1=x2-x1;
        int result2=y2-y1;
        float distance=(float)Math.pow((Math.pow(result1, 2)+Math.pow(result2, 2)), 1/2);
        
        System.out.println(distance+"");
        
    }
    
}
