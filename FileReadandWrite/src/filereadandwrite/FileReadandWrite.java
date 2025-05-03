
package filereadandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReadandWrite {

   
    public static void main(String[] args) {
        
        try {
            PrintWriter pw=new PrintWriter("C:\\Users\\Admin\\Documents\\parvej.txt");
            pw.println("hello parvej . eoirfueroierio "+"\n"+"jieirjreijreioijreiojrti");
            System.out.println("Created Succesfully ! ");
            
            pw.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadandWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File f=new File("C:\\Users\\Admin\\Documents\\parvej.txt");
        try {
            Scanner s=new Scanner(f);
            
            while(s.hasNext()){
            
            System.out.println(s.nextLine());
            }
            
           // System.out.println(s.nextLine());
         
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadandWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
