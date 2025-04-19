
package practicearrays;

import java.util.Arrays;
import java.util.Scanner;


public class PracticeArrays {

    public static void main(String[] args) {
       
//        String[] names={"Imran","Masud","Istiaque","Reja","Atik","Eiasin","Rakib"};
//        String[] passwords={"123","234","345","456","567","678","123"};
//        int[] marks={87,89,56,87,70,90,75};
//        
//        
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter A Name ");
//        String name=s.next();
//        
//        
//        for(int i=0;i<names.length;i++){
//            
//            if(name.equalsIgnoreCase(names[i])){
//
//                System.out.println("Enter Password ");
//                String userPassword=s.next();
//                int j=i;
//                
//                if(userPassword.equalsIgnoreCase(passwords[j])){
//                    
//                    System.out.println(" Welcome to your page ");
//                
//                }
//                else{
//                    System.out.println(" It's wrong \"Try Again\" ");
//                }
//                
//              
//                
//                
//                
//            }
//            
//            
//            
//        
//        }
        
        
        
        
        
        
        
        
        
        
        
        
//        for(int i=0;i<=6;i++){
//           System.out.println("His name is "+names[i]+" got "+marks[i]+" marks.");
//           System.out.println("His name is "+names[i]+" his Password is "+passwords[i]);
//        }

        Scanner s=new Scanner(System.in);
        System.out.println("Enter row limit ");
        int rows=s.nextInt();
        System.out.println("Enter cols limit ");
        int cols=s.nextInt();
        int[][] myNumbers=new int[rows][cols];
        
        for(int i=0;i<rows;i++){
        
            for(int j=0;j<cols;j++){
                System.out.print("[" + i + "][" + j + "] = ");
                myNumbers[i][j]=s.nextInt();
            }
        }
        System.out.println("my arrays "+Arrays.deepToString(myNumbers));
        
        for(int row=0;row<myNumbers.length;row++){
        
            for(int col=0;col<myNumbers[rows].length;col++){
            
                System.out.println(myNumbers[row][col]+" ");
            }
            System.out.println("\n");
        }
       









    }
    
}
