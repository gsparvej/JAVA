
package methodradiousvaluecircle;

import java.util.Scanner;


public class MethodRadiousValueCircle {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Radious Value ");
        float radious=s.nextFloat();
        
        float result=doAreaCircle(radious);
        
        System.out.println(result+"");
                
        
    }
    
    
    public static float doAreaCircle( float radious){   // its called METHOD //****
    
        double result;
        
        result= (Math.PI*Math.pow(radious, 2));
        return (float) result;
    }
}
