
package quadraticequation;

import java.util.Scanner;


public class QuadraticEquation {

    
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        
       
        
        System.out.println("Enter a's value ");
        int a=val.nextInt();
        
        System.out.println(" Enter b's value ");
        int b=val.nextInt();
        
        System.out.println(" Enter c's value ");
        int c=val.nextInt();
        
        float x1= (float) (-b+Math.sqrt((Math.pow(b, 2)-4*a*c)))/2*a;
        System.out.printf("  Is 1st Root %2.3f \n ", x1);
        
        float x2= (float) (-b-Math.sqrt((Math.pow(b, 2)-4*a*c)))/2*a;
        System.out.printf(" Is 2nd Root %2.3f \n ",x2);
        
        float discriminant=(float) (Math.pow(b, 2)-4*a*c);
        
        System.out.println(discriminant+"  discriminant is ");
        
        
        float root=(float) Math.sqrt(discriminant);
        
        
        int root2 = (int) root;      
        System.out.println(root2+"");
        
        
         if(root== (int)root ){
             System.out.println(root+" Real , Unequal and Rational ");
        }
        else{
             System.out.println(root+" Real , Unequal and Irrational ");
        }
        
    }
    
}
