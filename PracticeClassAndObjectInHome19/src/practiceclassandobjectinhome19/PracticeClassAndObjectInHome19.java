
package practiceclassandobjectinhome19;

import identifytriangle.Triangle;
import java.util.Scanner;
import math.Factorial;
import math.MaxMin;
import math.PrimeNumber;
import resultcollect.Student;


public class PracticeClassAndObjectInHome19 {

    public static void main(String[] args) {
       
        Triangle t=new Triangle(5, 10);
        System.out.println("Triangle's Area is "+t.area());
        
        PrimeNumber p=new PrimeNumber();
        System.out.println("The Number Is "+p.findPrimeNumber());
        
        
        MaxMin max=new MaxMin(5, 9, 11);
        System.out.println("The Max Number Is "+max.findMax());
        
        MaxMin min=new MaxMin();
        min.num1=5;
        min.num2=9;
        min.num3=11;
        System.out.println("The Min Number is "+min.findMin());
        
        
        
        Factorial f=new Factorial(5);
        System.out.println(""+f.findFactorial());
        
        
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Reja pls Enter Marks ");
        int rejaMarks=s.nextInt();
        
        System.out.println("Atik pls Enter Marks");
        int atikMarks=s.nextInt();
        
        
        
        Student reja=new Student("Reja");
        Student atik=new Student("Atik");
        
        
        reja.setMarks(rejaMarks);
        atik.setMarks(atikMarks);
        
        System.out.println(reja.getResult());
        System.out.println(atik.getResult());
        
    }
    
}
