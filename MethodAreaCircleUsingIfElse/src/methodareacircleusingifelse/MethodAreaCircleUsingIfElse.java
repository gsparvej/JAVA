
package methodareacircleusingifelse;

import java.util.Scanner;


public class MethodAreaCircleUsingIfElse {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        float radious=s.nextFloat();
        
    }
    
    
    public static float areaCircle(float radious){
    
    double result;
    
    
    
    
    
    if (radious <= 0) {
            System.out.println("Enter positve value of radious ");
            
            float radius = s.nextFloat();
            double result =  ( Math.PI * Math.pow(radius, 2));
            System.out.println("" + result);
        } else {
            double result2 = (Math.PI * Math.pow(radious, 2));
            System.out.println(" The Area Of " + result2);
        }
    
    
    
    
    result= (Math.PI*Math.pow(radious, 2));
    return (float) result;
    
    }
    
}
