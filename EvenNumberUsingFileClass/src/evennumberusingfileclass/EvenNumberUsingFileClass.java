package evennumberusingfileclass;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvenNumberUsingFileClass {

    public static void main(String[] args) {
        
        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Documents\\Even.txt");

            for (int i = 1; i <= 50; i++) {

                if (i % 2 == 0) {

//                System.out.println(""+i);
                    pw.print(" " + i);
                }

            }
            System.out.println("Success !");
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EvenNumberUsingFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
