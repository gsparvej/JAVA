
package maths;

import java.util.Scanner;


public class TriangleTest {
 
    
     int x1;
    int y1;
    int x2;
    int y2;


    public TriangleTest() {
    }

    public TriangleTest(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public TriangleTest(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

   
    
    
    
    public float getDistance(){
    
        int result1=x2-x1;
        int result2=y2-y1;

        float distance=(float)Math.sqrt(Math.pow(result1, 2)+Math.pow(result2, 2));
        return distance;
        
    
    }
    
    public float checkTriangle(){
    
    float finale = 0;
    return finale;
    } 
    
    

}
