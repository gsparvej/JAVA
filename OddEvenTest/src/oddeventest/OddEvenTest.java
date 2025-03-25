
package oddeventest;

import java.util.Scanner;


public class OddEvenTest {

    
    public static void main(String[] args) {
               Scanner val=new Scanner(System.in);
        System.out.println("Enter 1st number");
        float n1=val.nextFloat();
        if(n1%2==0){
            System.out.println(n1+" it is a Even number");
        }
        else{
            System.out.println(n1+" it is an Odd number");
        }
    }
    
}
