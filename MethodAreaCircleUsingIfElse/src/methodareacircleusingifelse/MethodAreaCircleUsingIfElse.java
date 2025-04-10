
package methodareacircleusingifelse;

import java.util.Scanner;


public class MethodAreaCircleUsingIfElse {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Radious Value ");
        float radious=s.nextFloat();
        
        float result=areaCircle(radious);
        
        System.out.println(result+"");
        
    }
    
    
    public static float areaCircle(float radious){
    
    double result;
    
    
    
    
    
    if (radious <= 0) {
            System.out.println("Enter positve value of radious ");
            
             radious = s.nextFloat();
             result =  ( Math.PI * Math.pow(radious, 2));
            // System.out.println("" + result);
        } else {
             result = (Math.PI * Math.pow(radious, 2));
            // System.out.println(" The Area Of " + result2);
        }
    
    
    
    
    result= (Math.PI*Math.pow(radious, 2));
    return (float) result;
    
    }
    
}
