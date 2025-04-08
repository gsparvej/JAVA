

package classtest;

import java.util.Scanner;



public class ClassTest {

    
    
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
//        String name=n.next();
//        String Programmer = "Programmer";
//        
//        
//        System.out.println(name+" "+Programmer);
//        
//        
//        System.out.println(name.concat(" Programmer"));


           System.out.println("Enter Year ");
        String year=n.next();
        System.out.println(" Enter Month ");
        String month=n.next();
        System.out.println(" Enter Date ");
        String date=n.next();
        
        System.out.println(month.concat( " ")+date.concat(", ")+year.concat(""));
        
    }
    
}
