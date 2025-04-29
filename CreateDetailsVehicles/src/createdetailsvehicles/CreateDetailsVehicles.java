
package createdetailsvehicles;

import createdetailsvehicles.vehicles.Truck;


public class CreateDetailsVehicles {

  
    public static void main(String[] args) {
        
        Truck t=new Truck();
        
        t.setWeight(2000);
        t.setRegularPrice(50000);
        
        
        System.out.println(""+t.getSalePrice());
               
    }
    
}
