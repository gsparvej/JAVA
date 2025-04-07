
package selecttraingle;

import java.util.Scanner;


public class SelectTraingle {

    
    public static void main(String[] args) {
        Scanner points=new Scanner(System.in);
        System.out.println("Enter Coordinates Of 'A' Point of (x-axis) ");
        int x1=points.nextInt();
        
        System.out.println("Enter Coordinates Of 'A' Point of (y-axis) ");
        int y1=points.nextInt();
        
        System.out.println("Enter Coordinates Of 'B' Point of (x-axis) ");
        int x2=points.nextInt();
        
        System.out.println("Enter Coordinates Of 'B' Point of (y-axis) ");
        int y2=points.nextInt();
        
        System.out.println("Enter Coordinates Of 'C' Point of (x-axis) ");
        int x3=points.nextInt();
        
        System.out.println("Enter Coordinates Of 'C' Point of (y-axis) ");
        int y3=points.nextInt();
        
        int result1=x2-x1;
        int result2=y2-y1;
        
        int result3=x3-x2;
        int result4=y3-y2;
        
        int result5=x1-x3;
        int result6=y1-y3;
        
        float distanceAB=(float)Math.sqrt(Math.pow(result1, 2)+Math.pow(result2, 2));
        
        float distanceBC=(float)Math.sqrt(Math.pow(result3, 2)+Math.pow(result4, 2));
        
        float distanceCA=(float)Math.sqrt(Math.pow(result5, 2)+Math.pow(result6, 2));
        
        
        System.out.println("  AB = " +distanceAB+ " ," + " BC = "+distanceBC+ "   ," + "  CA  = " +distanceCA);
        
        
        
        if(distanceAB==distanceBC && distanceAB==distanceCA && distanceBC== distanceCA){
            System.out.println("This is a Equilateral Triangle");
        }
        else if(!(distanceAB==distanceBC) && !(distanceAB==distanceCA) && !(distanceBC== distanceCA)){
            System.out.println(" This is a Scalene Triangle");
        }
        else{
            System.out.println(" This is a Isosceles Triangle ");
        }
    }
    
}
