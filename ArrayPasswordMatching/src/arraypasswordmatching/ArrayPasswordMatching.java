
package arraypasswordmatching;

import java.util.Scanner;


public class ArrayPasswordMatching {

    
    public static void main(String[] args) {
        
        String names[]={"parvej","rakib","eiasin","rahmat","atik"};
        String passwords[]={"123","234","456","678","890"};
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=s.next();
        
        for(int i=0;i<names.length;i++){
        
            if(name.equalsIgnoreCase(names[i])){
                System.out.println("Enter Your Password");
                String newPass=s.next();
                int j=i;
                
        
            if(newPass.equals(passwords[j])){
                System.out.println("welcome");
            }
            
            else{
                System.out.println("Sorry ! try Again later ");
            }
           
            
        }
            
            
            
        
        
        
        
        
        
    }
    
}
    
}
