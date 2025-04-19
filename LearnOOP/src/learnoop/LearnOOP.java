
package learnoop;

import FirstClassOOP.Circle;
import java.util.Scanner;


public class LearnOOP {

   
    public static void main(String[] args) {
        
        Circle c=new Circle(3);
        
        System.out.println(c.area()+" is Area of The Circle ");
        
        System.out.println(c.perimeter()+" is Perimeter Of The Circle ");
        
//        Student atik=new Student("Atik ",65);
//        Student shimul=new Student("Shimul", 70);


        Scanner s=new Scanner(System.in);
        System.out.println("Enter atik's marks ");
        int atikMarks=s.nextInt();
        System.out.println("Enter Shimul's marks");
        int shimulMarks=s.nextInt();
        
       
        Student atik=new Student("Atik");
        Student shimul=new Student("Shimul");
        
        System.out.println(atik.getResult());
        System.out.println(shimul.getResult());
    }
    
}
