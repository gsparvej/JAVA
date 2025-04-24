
package triangletestusingoop;

import java.util.Scanner;
import maths.TriangleTest;


public class TriangleTestUsingOOP {

   
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
        
        System.out.println("Enter Coordinates Of 3rd Point of (x-axis) ");
        int x3=points.nextInt();
        
        System.out.println("Enter Coordinates Of 3rd Point of (y-axis) ");
        int y3=points.nextInt();
      
        TriangleTest t=new TriangleTest();
       
        
        TriangleTest e=new TriangleTest(x1, y1, x2, y2);
        TriangleTest f=new TriangleTest(x2, y2, x3, y3);
        TriangleTest g=new TriangleTest(x1, y1, x3, y3);
        
        System.out.println("Distance of AB is "+e.getDistance());
        System.out.println("Distance of BC is "+f.getDistance());
        System.out.println("Distance of AC is "+g.getDistance());
        
        
        
        if(e.getDistance()==f.getDistance()&& e.getDistance()==g.getDistance()){
            System.out.println("Its somobahu ");
        }
        else if(e.getDistance()==f.getDistance() ||e.getDistance()==g.getDistance()|| f.getDistance()==g.getDistance()||e.getDistance()==g.getDistance()){
        
            
            System.out.println("Its somo di bahu ");
        }
        else{
            System.out.println("Its bisomo bahu ");
        }
        
       
        if(e.getDistance()>f.getDistance()&& e.getDistance()>g.getDistance()){
        
             System.out.println("Largest is : "+e.getDistance());
            
            float val1=(float) Math.pow(e.getDistance(), 2);
            float val2=(float) (Math.pow(f.getDistance(), 2)+Math.pow(g.getDistance(), 2));
            
            if(val1==val2){
            
                System.out.println("Its a Right Angle Triangle ");
            }
            else{
            
                System.out.println("Its Other Type Triangle ");
            }
           
        }
        else if(f.getDistance()>e.getDistance()&& f.getDistance()>g.getDistance()){
        
            System.out.println("Largest is : "+f.getDistance());
            
            float val1=(float) Math.pow(f.getDistance(), 2);
            float val2=(float) (Math.pow(e.getDistance(), 2)+Math.pow(g.getDistance(), 2));
            
            if(val1==val2){
            
                System.out.println("Its a Right Angle Triangle ");
            }
            else{
            
                System.out.println("Its Other Type Triangle ");
            }
            
        
        }
        else{
        
             System.out.println("Largest is : "+g.getDistance());
            
            float val1=(float) Math.pow(g.getDistance(), 2);
            float val2=(float) (Math.pow(f.getDistance(), 2)+Math.pow(e.getDistance(), 2));
            
            if(val1==val2){
            
                System.out.println("Its a Right Angle Triangle ");
            }
            else{
            
                System.out.println("Its Other Type Triangle ");
            }
            
           
        }
    }
    
}
