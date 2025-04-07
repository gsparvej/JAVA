
package traingletest;

import java.util.Scanner;


public class TraingleTest {

   
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
        
        if(distanceAB>distanceBC &&distanceAB>distanceCA ){
            System.out.println(distanceAB+ " distanceAB is largest ");
            
            
            float result7=distanceAB;
            float result8=distanceBC;
            float result9=distanceCA;
            
            float val1=(float) Math.pow(result7, 2);
            float val2=(float) Math.pow(((float) Math.pow(result8, 2)+ Math.pow(result9, 2)), 2);
            
            if(val1==val2){
                System.out.println(" Its a Right-angled Triangle");
            }
            else{
                System.out.println(" Its Other Type Of Traingle ");
            }
        }
        else if(distanceBC>distanceAB && distanceBC> distanceCA){
            System.out.println(distanceBC+" distanceBC is largest ");
            
            
            float result7=distanceBC;
            float result8=distanceAB;
            float result9=distanceCA;
            
            float val1=(float) Math.pow(result7, 2);
            float val2=(float) Math.pow(((float) Math.pow(result8, 2)+ Math.pow(result9, 2)), 2);
            
            if(val1==val2){
                System.out.println(" Its a Right-angled Triangle");
            }
            else{
                System.out.println(" Its Other Type Of Traingle ");
            }
            
        }
        else{
            System.out.println(distanceCA+" distanceCA is largest ");
            
            
            
            float result7=distanceCA;
            float result8=distanceAB;
            float result9=distanceBC;
            
            float val1=(float) Math.pow(result7, 2);
            float val2=(float) Math.pow(((float) Math.pow(result8, 2)+ Math.pow(result9, 2)), 2);
            
            if(val1==val2){
                System.out.println(" Its a Right-angled Triangle");
            }
            else{
                System.out.println(" Its Other Type Of Traingle ");
            }
            
        }
    }
    
}
