
package currenttime;


public class CurrentTime {

    
    public static void main(String[] args) {
        long Totalmiliseconds=System.currentTimeMillis();
        System.out.println(Totalmiliseconds+ "");
        long TotalSeconds=Totalmiliseconds/1000;
        System.out.println(TotalSeconds+"");
        long currentSeconds=TotalSeconds%60;
        long TotalMinutes=TotalSeconds/60;
        long CurrentMinutes=TotalMinutes%60;
        long TotalHour=TotalMinutes/60;
        long CurrentHour=(TotalHour%24);
        System.out.println(Totalmiliseconds+" Miliseconds is "+CurrentHour+" : "+CurrentMinutes+" : "+currentSeconds+" : ");
    }
    
}
