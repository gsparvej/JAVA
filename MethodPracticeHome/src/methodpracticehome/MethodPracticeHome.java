
package methodpracticehome;

import java.util.Scanner;


public class MethodPracticeHome {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter a Number ");
        int input=s.nextInt();
        
        
        String oddEven=findOddEven(input);
        System.out.println(oddEven+ "");
        
        
        
        //  positive negative zero 
        
        System.out.println(" To check Its Negative / positive or zero ");
        System.out.println("Enter a Number ");
        float n=s.nextFloat();
        
        String positiveNegativ=findNegativePositiveZero((int) n);
        System.out.println(positiveNegativ+"");
        
        
        
        
        System.out.println("Enter Day ");
        int day=s.nextInt();
        
        System.out.println(" Enter Month ");
        int month=s.nextInt();
        
        System.out.println(" Enter Year ");
        int year=s.nextInt();
        
        String view=doDateMonthYear(day, month, year);
        System.out.println(view+"");
        
        
        
        
        System.out.println(" To Check Leap Year ");
        System.out.println("Enter a Year :");
        int a=s.nextInt();
        
        String leapYear=findLeapYear(a);
        System.out.println(leapYear+"");
        
        
        
    }
    
    
    public static String findOddEven(int input){
    
    String result;
    
    if(input%2==0){
            result=input+" it is an Even number";
        }
        else{
            result=input+" it is an Odd number";
        }
    
    
    return result;
    
    }
    
    
    //positive negative zero find with METHOD//****** start****
    
    public static String findNegativePositiveZero(int n){
    
    String output;
    
    if(n>0){
        output= n+" It is Positive Number ";
    }
    else if(n<0){
        output= n+" It is Negative Number ";
    }
    else {
        output= n+" It is a Zero Number ";
    }
    
    
    return output;
    
    
    }
    
    
    
    
    
    // getDate//****** start******
    
    public static String doDateMonthYear(int day, int month, int year){
    
    String result;
    String newMonth=" ";
    String newDay=" ";
    
    
    
        if( (day>31 && month>1)
                ||(day>28 && month==2)
                ||(day>31 && month==3)
                ||(day>30 && month==4)
                ||(day>31 && month==5)
                ||(day>30 && month==6)
                ||(day>31 && month==7)
                ||(day>31 && month==8)
                ||(day>30 && month==9)
                ||(day>31 && month==10)
                ||(day>30 && month==11)
                ||(day>31 && month==12)){
        
            System.out.println(" Invalid Date ");
            System.exit(0);
        }
        
        else{
        newDay=day+" ";
        }
    
    
    
    
        switch (month) {
            case 1:
                newMonth="January";
                break;
                case 2:
                newMonth="February";
                break;
                case 3:
                newMonth="March";
                break;
                case 4:
                newMonth="April";
                break;
                case 5:
                newMonth="May";
                break;
                case 6:
                newMonth="June";
                break;
                case 7:
                newMonth="July";
                break;
                case 8:
                newMonth="August";
                break;
                case 9:
                newMonth="September";
                break;
                case 10:
                newMonth="October";
                break;
                case 11:
                newMonth="Novenber";
                break;
                case 12:
                newMonth="December";
                break;
            default:
                System.out.println(" Invalid Month ");
        }
    
    
    result=newMonth+" "+newDay+" ," +year;
    
    return result;
    
    
    }
    
    
    // find Leap Year//*** start*****
    
    public static String findLeapYear(int a){
    
        String submit;
        
        
        if(a%4==0 && !(a%100==0)){
            submit=a+" is a Leap Year";
        }
        else if(a%400==0){
            submit=a+" is a Leap Year";
        }
        else{
            submit=a+" is Not a Leap Year";
        }
        
        
        return submit;
        
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
