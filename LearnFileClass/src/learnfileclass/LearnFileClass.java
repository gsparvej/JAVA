package learnfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFileClass {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter Limit ");
        int limit=s.nextInt();
        for (int i = 1; i <=limit; i++) {

            try {
                System.out.println("Enter file name ");
                String fileName=s.next();
                PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Documents\\" + fileName+i+".txt");
               
                pw.print("Hello parvej. Nice to meet you ! ");
                System.out.println("File Created Successfully ! ");
                pw.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(LearnFileClass.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

//        try {
//            PrintWriter pw=new PrintWriter(f);
//            pw.print("Hello parvej. Nice to meet you ! ");
//            System.out.println("File Created Successfully ! ");
//            pw.close();
//            
//        } catch (FileNotFoundException ex) {
//            System.out.println("Wrong Location !");
//           // Logger.getLogger(LearnFileClass.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
