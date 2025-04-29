
package createdetailsvehicles;

import createdetailsvehicles.vehicles.Truck;


public class CreateDetailsVehicles {

  
    public static void main(String[] args) {
        
        Truck t=new Truck();
        
        t.setWeight(2001);
        t.setRegularPrice(50000);
        
         if(t.getWeight()>2000){
        double price;
        price=t.getRegularPrice()-(t.getRegularPrice()*0.01);
        
        System.out.println("Regular Price is : "+t.getRegularPrice()+" And "+"After Discount You Should Pay : "+price);
        }
         else{
         
             System.out.println("You Can't Get Discount And Regular Price Is :"+t.getRegularPrice());
         }
        
        
    }
    
}
