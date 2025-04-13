
package classtestthirteenthapril;

import java.util.Arrays;
import java.util.Scanner;


public class ClassTestThirteenthApril {

   
    public static void main(String[] args) {
        
//        Scanner n=new Scanner(System.in);
//        System.out.println(" Enter how many number u want to input names ");
//        String na=n.nextLine();
//        //String[] myNames=new String[na];
//        
//        for(int i=0;i<=myNames.length;i++){
//            System.out.println(i+"");
//        }



        Scanner s=new Scanner(System.in);
        System.out.println(" Enter how many number u want to input ");
        int n=s.nextInt();
        
        
        String[] myNames=new String[n];
        int[] myArray=new int[n];
        
        
        for(int i=0;i<n;i++){
        
            System.out.println("Enter Numbers ");
            int userInput=s.nextInt();
            myArray[i]=userInput;
           // System.out.println(Arrays.toString(myArray));
        }
        
        System.out.println(Arrays.toString(myArray));
        
        
//        System.out.println(" Enter number ");
//        int b=s.nextInt();
        for(int i=0;i<n;i++){
            
            System.out.println(" Enter Names ");
            String names=s.next();
            myNames[i]=names;
            
        
        }
        System.out.println(Arrays.toString(myNames));
        
        
        
         for(int i=0;i<=4;i++){
        
            System.out.println(myNames[i]+" = "+myArray[i]);
            
        }
        
        
        
        
        
        
        
        
    }
    
   
    

}
