
package learnqueues;

import java.util.LinkedList;
import java.util.Queue;


public class LearnQueues {

    public static void main(String[] args) {
      
        Queue<Integer> numbers=new LinkedList<>();
//        
//        numbers.offer(10);
//        numbers.offer(20);
//        numbers.offer(60);
//        numbers.offer(30);
//        numbers.offer(7);
        

            try {
                 numbers.remove();
        System.out.println(numbers);
            
        } catch (Exception e) {
                System.out.println(e);
        }
//        System.out.println(numbers);
//        numbers.remove();
        System.out.println(numbers);
//        numbers.poll();
//        System.out.println(numbers);
    }
    
}
