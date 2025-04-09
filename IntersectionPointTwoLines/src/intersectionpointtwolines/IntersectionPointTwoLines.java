
package intersectionpointtwolines;

import java.util.Scanner;


public class IntersectionPointTwoLines {

   
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        
        System.out.println("Enter a1's value ");
        int a1=n.nextInt();
        
        System.out.println("Enter b1's value ");
        int b1=n.nextInt();
        
        System.out.println("Enter c1's value ");
        int c1=n.nextInt();
        
        System.out.println("Enter a2's value ");
        int a2=n.nextInt();
        
        System.out.println("Enter b2's value ");
        int b2=n.nextInt();
        
        System.out.println("Enter c2's value ");
        int c2=n.nextInt();
        
        int x=(b1*c2-b2*c1)/(a1*b2-a2*b1);
        int y=(a2*c1-a1*c2)/(a1*b2-a2*b1);
        
        System.out.println(" The Intersection Point of (x,y) is "+"("+x+","+y+")");
        
                
              
    }
    
}
