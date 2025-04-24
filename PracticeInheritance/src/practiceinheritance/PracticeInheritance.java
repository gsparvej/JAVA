
package practiceinheritance;

import java.util.Scanner;
import practiceinheritance.District.Mymensingh;


public class PracticeInheritance {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        Mymensingh my=new Mymensingh();
        
        System.out.print("Enter Area : ");
        my.setArea(s.nextDouble());
        System.out.print("Enter Zilla List : ");
        my.setZillaList(s.nextDouble());
        System.out.print("Enter Famous Food Name : ");
        my.setFamousFood(s.next());
        
        
        
        System.out.println("Area : "+my.getArea()+"\n"
        +" Zilla List : "+my.getZillaList()+"\n"
        +" Famous Food : "+my.getFamousFood());
    }
    
}
