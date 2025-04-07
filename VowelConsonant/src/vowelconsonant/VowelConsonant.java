
package vowelconsonant;

import java.util.Scanner;


public class VowelConsonant {

    private static char a;

    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Your Finding Alphabet Like as A or B ");
            String alphabet= input.next().toLowerCase();
            
            if(alphabet="a" || alphabet="e"){
                System.out.println("Vowel");
            }
    }
     
}
