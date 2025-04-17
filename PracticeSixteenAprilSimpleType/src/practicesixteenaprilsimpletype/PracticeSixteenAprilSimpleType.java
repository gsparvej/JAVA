
package practicesixteenaprilsimpletype;

import java.util.Scanner;


public class PracticeSixteenAprilSimpleType {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        
        // hour, minutes, seconds convert// start*****1
        
//        System.out.println("Enter Total Seconds ");
//        int totalSeconds=s.nextInt();
//        
//        int hour=totalSeconds/3600;
//        int remindSeconds=totalSeconds%3600;
//        int minutes=remindSeconds/60;
//        int seconds=remindSeconds%60;
//        
//        System.out.println(hour+" hours "+minutes+" minutes "+seconds+" seconds ");



    // current time start //******2


//        long totalMiliSeconds=System.currentTimeMillis();
//        System.out.println(totalMiliSeconds+" now total mili seconds ");
//        long totalSeconds=totalMiliSeconds/1000;
//        System.out.println(totalSeconds+" total seconds ");
//        long totalhour=totalSeconds/3600;
//        System.out.println(totalhour+"");
//        long remindSeconds=totalhour%3600;
//        System.out.println(remindSeconds+"");
//        long currentSeconds=totalSeconds%60;
//        long totaltminutes=totalSeconds/60;
//        long currentMinutes=totaltminutes%60;
//        long totalHour=totaltminutes/60;
//        long currentHour=totalHour%60;
//        long hour=((currentHour%12)+6)%12;
//        
//        
//        
//        System.out.println(hour+" hours "+currentMinutes+" minuts "+" "+currentSeconds+" seconds ");
//        System.out.println(hour+" : "+currentMinutes+" : "+" "+currentSeconds+" +GMT ");



        // Factorial using if and for loop start//****3


//        System.out.println("Enter a Number for Factorial ");
//        int f=s.nextInt();
//        int factorial=1;
//       
//        
//        
//        if(f<0){
//            System.out.println("Enter Greater Than Zero Or Positive Number ");
//            int userInput=s.nextInt();
//            
//            for(int i=1;i<=userInput;i++){
//        
//        factorial*=i;
//        }
//        System.out.println(factorial+"");
//       
//            
//        }
//        
//        else{
//        for(int i=1;i<=f;i++){
//        
//        factorial*=i;
//        }
//        System.out.println(factorial+"");
//        }




        //factorial using do while loop// start**** 3 or 
        
//        System.out.println(" Enter a Number ");
//        int n=s.nextInt();
//        int count=1;
//        int factorial=1;
//        
//        if (n<0){
//            System.out.println("Enter positive or Greater Than zero value ");
//            
//            do{
//            factorial*=count;
//            count++;
//            }
//            while(count<=n);
//            System.out.println(factorial+"");
//            System.out.println(count+"");
//        }
        
        // guess number random.math// start****4
        
        
//        int randomNumber=(int) (Math.random()*10);
//        System.out.println(randomNumber+"");
//        
////        System.out.println(" Enter Your Guessing Number ");
////        int guessNumber=s.nextInt();
//        int count=0;
//        boolean isGuessed= false;
//        
//        while(count<3){
//            System.out.println("Enter Your Guess Number ");
//            int userInput=s.nextInt();
//            
//            if(userInput==randomNumber){
//                System.out.println("You Win");
//                isGuessed=true;
//                break;
//                
//            }
//            else if(userInput>randomNumber){
//                System.out.println("Too High !!! ");
//                
//            }
//            else {
//                System.out.println(" Too Low !!! ");
//            }
//            count++;
//        }
//        if(!isGuessed){
//            System.out.println("Better Luck Next Time , Thank You ! ");
//        }



// Prime Number check start/// ***** 5



//            System.out.println("Enter a Number to check its Prime or Not ");
//            int p=s.nextInt();
//            int count=0;
//            
//            for(int i=1;i<=p;i++){
//            if(p%i==0){
//                count++;
//            }
//            }
//            if(count==2){
//                System.out.println(p+" Its Prime ");
//            }
//            else{
//                System.out.println(p+" Its Not a Prime ");
//            }




// 1-joto porjonto prime number dekhte chai //start ***** 6


//        System.out.println("Enter a Number ");
//        int input=s.nextInt();
//        
//        
//        for(int i=2;i<=input;i++){
//        boolean isPrime=true;
//        
//        
//        for(int j=2;j<=Math.sqrt(i);j++){
//        
//            if(i%j==0){
//            isPrime=false;
//            break;
//            }
//        }
//        
//        
//        
//        if(isPrime){
//            System.out.print(i+" ");
//        }
//        }
            
        



        // Array Password Matching// start ******7
        
        
        
        String[] names={"Shimul","Imran","Masud","Istiaque","Atik","Reja","Rakib","Eiasin"};
        String[] password={"123","234","132","432","543","567","876","904"};
        
        System.out.println(" Enter User Name ");
        String userName=s.next();
       
        
        for(int i=0;i<names.length;i++){
        
            if(userName.equalsIgnoreCase(names[i])){
                System.out.println(" Enter Your Password ");
                String newPassword=s.next();
                int j=i;
                
                
                if(newPassword.equals(password[j])){
                    System.out.println("Welcome To Your Page ");
                   
                }
                
                else{
                    System.out.println("Sorry, Your Password is not matched ");
                }
                
            }
             
            
             
            
            
        }
        for(int i=0;i<names.length;i++){
            
        if(! userName.equalsIgnoreCase(names[i])){
                
            }
        
        }
        System.out.println(" User Name is not Matched , please Try Again ");


        // find large number from array //start***** 8
        
        
        
        
        
        
    }
    
}
