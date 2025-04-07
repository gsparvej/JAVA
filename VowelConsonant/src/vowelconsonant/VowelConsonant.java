
package vowelconsonant;

import java.util.Scanner;


public class VowelConsonant {

    private static char a;

    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Your Finding Alphabet Like as A or B ");
            String alphabet= input.next().toLowerCase();
            
            if(alphabet.equalsIgnoreCase("a") || alphabet.equalsIgnoreCase("e")|| alphabet.equalsIgnoreCase("i") || alphabet.equalsIgnoreCase("o") || alphabet.equalsIgnoreCase("u")){
                System.out.println(" Its Vowel");
            }
            else{
                System.out.println(" Its Consonant ");
            }
    }
     
}
