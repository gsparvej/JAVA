
package areacircle;

import java.util.Scanner;


public class AreaCircle {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Radius 'n' ");
       int n=input.nextInt();
       double result=Math.PI*(n*n);
       
//       float result= (float) 3.1416*n*n;
        System.out.println(result+"");
       
    }
    
}
