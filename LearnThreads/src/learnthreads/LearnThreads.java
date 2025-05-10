
package learnthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class LearnThreads {

    public static void main(String[] args) {
        
        ExecutorService executor=Executors.newFixedThreadPool(10);
        
         for (int i = 1; i <= 10; i++) {
            Runnable task = new MyTask(i);
            executor.submit(task);
        }
         executor.shutdown();
        
    }
    
}
