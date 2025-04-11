
package practicehome;

import java.util.Scanner;

public class PracticeHome {

    
    public static void main(String[] args) {
//        Scanner power=new Scanner(System.in);
//        System.out.println("Enter m's value ");
//       float m=power.nextFloat();
//        System.out.println("Enter r's value ");
//       float r=power.nextFloat();
//        float result= (float) (m*Math.pow(r, 2));
//        System.out.println(result+" Is Your Result ");


//int a =6;
//int b= ++a;
//        System.out.println(a);


//        Scanner price= new Scanner(System.in);
//        System.out.println("Enter Product Price");
//        double PurchaseAmount=price.nextDouble();
//        Scanner taxes= new Scanner(System.in);
//        System.out.println("Enter Product Price taxes");
//         double tax=taxes.nextDouble();
//        double pay=PurchaseAmount*(tax/100);
//        double result=(PurchaseAmount+pay)/100;
//        System.out.println( "$ "+result+" You Must Pay For This Product ");


//        Scanner val=new Scanner(System.in);
//        System.out.println("Enter KM value");
//        float input=val.nextFloat();
//        float result=input*1000/3600;
//        System.out.println("Your m/s result is "+result+"m/s ");

        
//           Scanner minutes=new Scanner(System.in);
//           System.out.println("Enter Your Minutes");
//           double input=minutes.nextDouble();
//           int year=(int)input/518400;
//           int day=(int)input%518400;
//           int CurrentDays=day/1440;
//           System.out.println(year+" Years "+CurrentDays+" Days ");
//           System.out.println(day);

//             int a = 6;
//             int b = a++;
//            System.out.println(a);
//            System.out.println(b);
//        
//            
//             a = 6;
//             System.out.println(a);
//             b = ++a;
//            System.out.println(a);
//            System.out.println(b);

//                Scanner s = new Scanner(System.in);
//                System.out.println("Enter Interest Rate like as 12.5% : ");
//                double interestRate=s.nextDouble();
//                double monthlyInterestRate=interestRate/1200;
//                System.out.println("Enter Year : ");
//                int numberOfYear=s.nextInt();
//                System.out.println("Enter Loan Amount : ");
//                double loanAmount=s.nextDouble();
//                double monthlyPayment=loanAmount*monthlyInterestRate / (1-1/Math.pow(1+monthlyInterestRate, numberOfYear*12));
//                double totalAmount=monthlyPayment*numberOfYear*12;
//                System.out.println("Monthly Payment is "+monthlyPayment);
//                System.out.println("Total Payment is "+totalAmount);
                


//                Scanner input=new Scanner(System.in);
//                
//                System.out.println("Enter 1st Number ");
//                int n1=input.nextInt();
//                
//                System.out.println("Enter 2nd Number ");
//                int n2=input.nextInt();
//                
//                int result=n1+n2;
//                System.out.println(result+"");
           
            
//            Scanner s=new Scanner(System.in);
//            System.out.println(" Enter Number ");
//            int input=s.nextInt();
//            System.out.println(" Enter Text  ");
//            String  text=s.next();
//           for(int i=1;i<=input;i++){
//           
//               System.out.println(text);
//           }




        // factorial test/// start *****
        
        
//        Scanner s=new Scanner(System.in);
//        
//        System.out.println(" Enter a number " +"\n"+" To check Factorial ");
//        
//        int input =s.nextInt();
//        int count=1;
//        long factorial =1;
//        
//       if(input<0){
//           System.out.println(" Please Enter Greater Than Zero ");
//           input=s.nextInt();
//           
//           
//           
//            for(int i=1;i<=input;i++){
//            factorial*=count;
//            count++;
//        }
//       }
//        System.out.println(factorial+"");

        
        
        
        
        // chatgpt pb ***  1-100 odd number print//
        
//        Scanner s=new Scanner(System.in);
//        int input=s.nextInt();
//        
//        int count=0;
//        for(int i=1;i<=input;i++){
//            if(i%2==0){
//                 System.out.println(i+" This is Even Number ");
//                 count++;
//            }
//           
//        
//        }
        
        
                
            
            // using while loop 
            
//            Scanner s= new Scanner(System.in);
//            
//            System.out.println("Enter a number to show all even number in it ");
//            
//            int n=s.nextInt();
//            int count=1;
//            
//            while(count<=n){
//              
//            
//                    if(count%2==1){
//                    count++;
//                    continue;
//                    }
//                    System.out.println(count+" This is Even number ");
//                    count++;
//            }
            
            
            // 1-50 sum 
            
//            Scanner s=new Scanner(System.in);
//            System.out.println("Enter no to sum 1 to it ");
//            System.out.println(" How Much You Want ");
//            int n=s.nextInt();
//            int sum=0;
//            int count = 0;
//            int i;
//            
//            for ( i=1;i<n;i++){
//                sum+=i;
//                System.out.print(i+"+");
//            }
//            sum+=i;
//            count++;
//            System.out.print(i+"");
//            System.out.print( " = "+sum+"\n");
            
            
            
            
            
            // show traiangle type star *****  start// 
            
//            Scanner s=new Scanner(System.in);
//            System.out.println("Enter no to sum 1 to it ");
//            System.out.println(" How Much You Want ");
//            int n=s.nextInt();
//            int sum=0;
//            int count = 0;
//            int i;
//            
//            for ( i=0;i<=n;i++){
//                
//                for(int j=1;j<=i;j++){
//                System.out.print("*");
//                }
////                sum+=i;
////                
////                count++;
//            System.out.println("*");
//                
//            }
//            System.out.println("----");
//            System.out.println("sum of=" + sum+"");



            // Multiplication Table start //*****
            
//            Scanner s=new Scanner(System.in);
//            System.out.println(" Which Class's Multiplication Table will watch ");
//            int n=s.nextInt();
//            int i;
//            int b=10;
//          
//            
//            
//            for( i=1;i<=b;i++){
//            System.out.println(n+"*"+i+"="+(n*i));
//            }
            
            



            Scanner s=new Scanner(System.in);
            System.out.println("Enter no to Multiplication 1 to it ");
            System.out.println(" How Much You Want ");
            int n=s.nextInt();
            int mul=1;
            int count = 0;
            int i;
            
            for ( i=1;i<n;i++){
                mul*=i;
                System.out.print(i+"*");
                //System.out.println("");
            }
            mul*=i;
            count++;
            System.out.print(i+"");
            System.out.print( " = "+mul+"\n");
            
       
            
                    
            
        
    }
    
}
