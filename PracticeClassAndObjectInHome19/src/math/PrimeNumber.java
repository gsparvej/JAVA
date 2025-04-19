
package math;


public class PrimeNumber {
    
    int number=7;

    public PrimeNumber() {
    }
    
    public PrimeNumber(int newNumber){
    number=newNumber;
    }
    public String findPrimeNumber(){
    int count=0;
    for(int i=1;i<=number;i++){
    
        if(number%i==0){
        count++;
        }
    }
    if(count==2){
    return "It is Prime ";
    }
    else{
    return "It is Not Prime ";
    }
    }
    
}
