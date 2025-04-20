
package maths;

import java.util.Scanner;


public class TriangleTest {
 
    
    
    
//     Scanner points = new Scanner(System.in);
//        System.out.println("Enter Coordinates Of 'A' Point of (x-axis) ");
//        int x1 = points.nextInt();
//
//        System.out.println("Enter Coordinates Of 'A' Point of (y-axis) ");
//        int y1 = points.nextInt();
//
//        System.out.println("Enter Coordinates Of 'B' Point of (x-axis) ");
//        int x2 = points.nextInt();
//
//        System.out.println("Enter Coordinates Of 'B' Point of (y-axis) ");
//        int y2 = points.nextInt();
//
//        System.out.println("Enter Coordinates Of 'C' Point of (x-axis) ");
//        int x3 = points.nextInt();
//
//        System.out.println("Enter Coordinates Of 'C' Point of (y-axis) ");
//        int y3 = points.nextInt();

        int result1; 
        int result2 ;

        int result3;
        int result4 ;

        int result5; 
        int result6; 

    public TriangleTest() {
    }

    public TriangleTest(int result1, int result2, int result3, int result4, int result5, int result6){
        this.result1 = result1;
        this.result2 = result2;
        this.result3 = result3;
        this.result4 = result4;
        this.result5 = result5;
        this.result6 = result6;
       
    }
        
        

        float distanceAB = (float) Math.sqrt(Math.pow(result1, 2) + Math.pow(result2, 2));

        float distanceBC = (float) Math.sqrt(Math.pow(result3, 2) + Math.pow(result4, 2));

        float distanceCA = (float) Math.sqrt(Math.pow(result5, 2) + Math.pow(result6, 2));
        
        
        System.out.println("distanceAB :"+distanceAB+" distanceBC :"+distanceBC+" distanceCA :"+distanceCA  );

        if (distanceAB > distanceBC && distanceAB > distanceCA) {
            System.out.println(distanceAB + " distanceAB is largest ");

//            float result7=distanceAB;
//            float result8=distanceBC;
//            float result9=distanceCA;
            float val1 = (float) Math.pow(distanceAB, 2);
            float val2 = (float) (Math.pow(distanceBC, 2) + Math.pow(distanceCA, 2));

            System.out.println("Val 1="+ val1+ " Val  2= "+val2);
            // test Coordinates for Right-Angle Traiangle 
            // (2,5), (-1,1), (2,1)
            if (val1 == val2) {
                System.out.println(" Its a Right-angled Triangle");
            } else {
                System.out.println(" Its Other Type Of Traingle ");
            }
        } else if (distanceBC > distanceAB && distanceBC > distanceCA) {
            System.out.println(distanceBC + " distanceBC is largest ");

            float result7 = distanceBC;
            float result8 = distanceAB;
            float result9 = distanceCA;

            float val1 = (float) Math.pow(result7, 2);
            float val2 = (float) (Math.pow(result8, 2) + Math.pow(result9, 2));

            if (val1 == val2) {
                System.out.println(" Its a Right-angled Triangle");
            } else {
                System.out.println(" Its Other Type Of Traingle ");
            }

        } else {
            System.out.println(distanceCA + " distanceCA is largest ");

            float result7 = distanceCA;
            float result8 = distanceAB;
            float result9 = distanceBC;

            float val1 = (float) Math.pow(result7, 2);
            float val2 = (float) (Math.pow(result8, 2) + Math.pow(result9, 2));

            if (val1 == val2) {
                System.out.println(" Its a Right-angled Triangle");
            } else {
                System.out.println(" Its Other Type Of Traingle ");
            }

        }
}
