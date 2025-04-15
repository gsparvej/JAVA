
package practicearrays;

import java.util.Scanner;


public class PracticeArrays {

    public static void main(String[] args) {
       
        String[] names={"Imran","Masud","Istiaque","Reja","Atik","Eiasin","Rakib"};
        String[] passwords={"123","234","345","456","567","678","123"};
        int[] marks={87,89,56,87,70,90,75};
        
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A Name ");
        String name=s.next();
        
        
        for(int i=0;i<names.length;i++){
            
            if(name.equalsIgnoreCase(names[i])){

                System.out.println("Enter Password ");
                String userPassword=s.next();
                int j=i;
                
                if(userPassword.equalsIgnoreCase(passwords[j])){
                    
                    System.out.println(" Welcome to your page ");
                
                }
                else{
                    System.out.println(" It's wrong \"Try Again\" ");
                }
                
              
                
                
                
            }
            
            
            
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
//        for(int i=0;i<=6;i++){
//           System.out.println("His name is "+names[i]+" got "+marks[i]+" marks.");
//           System.out.println("His name is "+names[i]+" his Password is "+passwords[i]);
//        }
    }
    
}
