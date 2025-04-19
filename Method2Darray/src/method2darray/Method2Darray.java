package method2darray;

import java.util.Arrays;
import java.util.Scanner;

public class Method2Darray {

    public static void main(String[] args) {

    }

    public static int doSumArray() {

        int result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row limit ");
        int rows = s.nextInt();
        System.out.println("Enter cols limit ");
        int cols = s.nextInt();
        int[][] myNumbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                myNumbers[i][j] = s.nextInt();
            }
        }
        //System.out.println("my arrays "+Arrays.deepToString(myNumbers));

        for (int row = 0; row < myNumbers.length; row++) {

            for (int col = 0; col < myNumbers[row].length; col++) {

                result = myNumbers[row][col];
            }

        }
        int end = result;
        return result;

    }

}
