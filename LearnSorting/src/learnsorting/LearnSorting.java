package learnsorting;

import java.util.Arrays;

public class LearnSorting {

    public static void main(String[] args) {
        
        int []numbers={19,45,20,80,70,90};

        insertionSort(numbers);
        
        // sir er class dekhe ekhane correction korte hbe *******************
        
    }

    public static void insertionSort(int[] list) {

         int []numbers={19,45,20,80,70,90};
        for (int i = 1; i < numbers.length; i++) {

            int currentElement = numbers[i];

            int k;
            for( k=i-1;k>=0 && numbers[k]> currentElement;k--){
            
            numbers[k+1]=numbers[k];
            
            }
            numbers[k+1]=currentElement;

        }
        System.out.println(Arrays.toString(numbers));
        
        
 
    }

}
