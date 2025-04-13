
package practicehomechatgpt;

import java.util.Scanner;


public class PracticeHomeChatgpt {

    
    public static void main(String[] args) {
        
        
//        Scanner s=new Scanner(System.in);
//        
//        System.out.println(" How Much You Want ");
//        int a=s.nextInt();
//        s.nextLine();
//        System.out.println(" What do you want to see ");
//        String text=s.nextLine();
//       
//        int i;
//        int count=0;
//        
//        for( i=1;i<=a;i++){
//            count++;
//            System.out.println(i+" "+text);
//        }
        

            // start******

//        Scanner s=new Scanner(System.in);
//        
//        System.out.println(" Enter Number ");
//        int a=s.nextInt();
//        
//        for(int i=1;i<=a;i++){
//            
//            if(i%2==0){
//                System.out.println(i+" Even Number ");
//            }
//        }
            



//        Scanner s=new Scanner(System.in);
//        System.out.println(" Reverse Number ");
//        int a=s.nextInt();
//        for (int i=a;i>=1;i--){
//        
//            System.out.println(i+"");
//        }
        

        // multiplication table start *****
        
//        Scanner s=new Scanner(System.in);
//        int a=s.nextInt();
//       
//        for(int i=1;i<=10;i++){
//            System.out.println(a+"*"+i+"="+(a*i));
//        }



//        Scanner s=new Scanner(System.in);
//        System.out.println(" Renge of Sum ");
//        int a =s.nextInt();
//        int sum=0;
//        for(int i=1;i<=a;i++){
//            sum+=i;
//            System.out.print(i+"+");
//        }
//        System.out.println("="+sum+"");




        // palidrome number test//***** 
        
        
//        Scanner s=new Scanner(System.in);
//        System.out.println(" Enter Number ");
//        
//        int a=s.nextInt();
//        int digit;
//        
//        for(int i=0;i<=a;i++){
//        digit=a%10;
//        a=a/10;
//            System.out.print(digit+"");
//        }
        

            
              Scanner s=new Scanner(System.in);
              System.out.println(" Enter Name to Palidrome ");
              String name=s.nextLine();
              
              name=name.toLowerCase();
              String reverse="";
              
              for(int i=name.length()-1;i>=0;i--){
              reverse+=name.charAt(i);
                  //System.out.print(reverse+"");
              }
              System.out.println(reverse+"");
              
              if(name.equals(reverse)){
                  System.out.println(name+" Its Palindrome is "+reverse);
              }
              else{
              System.out.println(name+" Its Not A Palindrome " +reverse);
              }
            
        
    }
    
}
