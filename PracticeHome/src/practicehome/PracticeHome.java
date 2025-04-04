
package practicehome;

import java.util.Scanner;

public class PracticeHome {

    
    public static void main(String[] args) {
//        Scanner power=new Scanner(System.in);
//        System.out.println("Enter m's value ");
//       float m=power.nextFloat();
//        System.out.println("Enter r's value ");
//       float r=power.nextFloat();
//        float result= (float) (m*Math.pow(r, 2));
//        System.out.println(result+" Is Your Result ");


//int a =6;
//int b= ++a;
//        System.out.println(a);


        Scanner price= new Scanner(System.in);
        System.out.println("Enter Product Price");
        double PurchaseAmount=price.nextDouble();
        Scanner taxes= new Scanner(System.in);
        System.out.println("Enter Product Price taxes");
         double tax=taxes.nextDouble();
        double pay=PurchaseAmount*(tax/100);
        double result=(PurchaseAmount+pay)/100;
        System.out.println( "$ "+result+" You Must Pay For This Product ");
        
        
    }
    
}
