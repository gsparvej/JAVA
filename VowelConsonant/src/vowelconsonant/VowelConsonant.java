
package vowelconsonant;

import java.util.Scanner;


public class VowelConsonant {

    private static char a;

    
    public static void main(String[] args) {
//        Scanner vc=new Scanner(System.in);
        System.out.println(" Check Vowel or Consonant ");
        System.out.println(" Enter English Latter : ");
       
        char ch ='a';
//        char alphabet2 = 'e';
//        char alphabet3 = 'i';
//        char alphabet4 = 'o';
//        char alphabet5 = 'u';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println(" Its Vowel");
        }
        else{
            System.out.println("Its Consonant ");
        }
    }
    
}
