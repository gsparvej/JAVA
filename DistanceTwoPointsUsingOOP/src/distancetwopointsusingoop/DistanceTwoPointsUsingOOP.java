
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
        
        System.out.println("Enter Coordinates Of 3rd Point of (x-axis) ");
        int x3=points.nextInt();
        
        System.out.println("Enter Coordinates Of 3rd Point of (y-axis) ");
        int y3=points.nextInt();
      
        
        Distance e=new Distance(x1, y1, x2, y2);
        Distance f=new Distance(x2, y2, x3, y3);
        Distance g=new Distance(x1, y1, x3, y3);
        
        System.out.println("Distance of AB is "+e.getDistance());
        System.out.println("Distance of BA is "+f.getDistance());
        System.out.println("Distance of AC is "+g.getDistance());
        
        
        
        
    }
    
}
