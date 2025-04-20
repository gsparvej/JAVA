
package distancetwopointsusingoop;

import java.util.Scanner;
import maths.Distance;


public class DistanceTwoPointsUsingOOP {

    
    public static void main(String[] args) {
        
        
      Distance d=new Distance(3,5);
      System.out.println("Distance is "+d.getDistance());
        
        
        
        // scanner use try.....
        
        Scanner points=new Scanner(System.in);
        
        System.out.println("Enter Coordinates Of 1st Point of (x-axis) ");
        int x1=points.nextInt();
        
        System.out.println("Enter Coordinates Of 1st Point of (y-axis) ");
        int y1=points.nextInt();
        
        System.out.println("Enter Coordinates Of 2nd Point of (x-axis) ");
        int x2=points.nextInt();
        
        System.out.println("Enter Coordinates Of 2nd Point of (y-axis) ");
        int y2=points.nextInt();
      
        
        Distance e=new Distance(x1, y1, x2, y2);
        System.out.println("Distance is "+e.getDistance());
    }
    
}
