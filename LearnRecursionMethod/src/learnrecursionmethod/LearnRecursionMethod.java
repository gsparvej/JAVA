
package learnrecursionmethod;


public class LearnRecursionMethod {

   
    public static void main(String[] args) {
        
        System.out.println(""+fac(5));
      //  System.out.println(""+odd(10));
        method(500545840);
    }
    
    public static long fac(int n){
    
        if(n==0){
        
        return 1;
        }
    
        else{
        
            return n*fac(n-1);
        }
    
    
    }
    public static void method(int n){
    
        if(n>0){
        
            System.out.println(n%10);
            method(n/10);
        
        }
      // System.out.println("");
    
    
    }
    
    
}
