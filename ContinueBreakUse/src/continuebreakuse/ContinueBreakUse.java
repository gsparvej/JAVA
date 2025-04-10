
package continuebreakuse;


public class ContinueBreakUse {

    
    public static void main(String[] args) {
        int targetValue=100;
        int count=1;
        
        while (targetValue >= count){
        
                if(count%3 ==0 && count%5 ==0){
                count++;
                continue;
                }
                System.out.println(count+ " No. is ");
        count++;
        }
        
    }
    
}
