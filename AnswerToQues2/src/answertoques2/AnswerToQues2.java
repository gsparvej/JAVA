
package answertoques2;


public class AnswerToQues2 {

    
    public static void main(String[] args) {
        
         try {
           
            int result = 100 / 0;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println(e);
        }
    }
    
}
