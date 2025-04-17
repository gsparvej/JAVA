
package learnmultidimensionalarray;

import java.util.Arrays;


public class LearnMultiDimensionalArray {

  
    public static void main(String[] args) {
        
        int[][] myArrays=new int[2][3];
        
        System.out.println(Arrays.deepToString(myArrays));
        
        myArrays[0][0]=1;
        myArrays[0][1]=2;
        myArrays[0][2]=3;
        myArrays[1][0]=6;
        myArrays[1][1]=4;
        myArrays[1][2]=9;
        
        System.out.println(Arrays.deepToString(myArrays));
        System.out.println("\n");
        
        
        for(int row=0;row<myArrays.length;row++){
        
            for(int col=0;col<myArrays[row].length;col++){
            
                System.out.print(myArrays[row][col]+" ");
            }
            System.out.println("\n");
            
        }
        
    }
    
}
