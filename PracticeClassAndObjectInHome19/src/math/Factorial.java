
package math;


public class Factorial {
    
    int input;

    public Factorial() {
    }

    public Factorial(int input) {
        this.input = input;
    }
    
    public String findFactorial(){
    
    int factorial=1;
    for(int i=1;i<=input;i++){
    
        factorial*=i;
    }
    String message=factorial+" factorial"+" of "+input;
    
    
    
    return message;
    }
}
