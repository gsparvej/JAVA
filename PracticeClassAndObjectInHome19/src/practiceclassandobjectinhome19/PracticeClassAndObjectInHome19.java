
package practiceclassandobjectinhome19;

import identifytriangle.Triangle;
import math.MaxMin;
import math.PrimeNumber;


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
        
        
    }
    
}
