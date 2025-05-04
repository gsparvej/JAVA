package vehiclemain;

import vehiclemain.vehicle.Bike;
import vehiclemain.vehicle.Car;

public class VehicleMain {

    public static void main(String[] args) {

        // eta perfect way............. 
        
        
        Car c = new Car();
        Bike b = new Bike(true);

        c.setBrand("Honda");
        c.setSpeed(100);
        c.setNumberOfDoors(4);
        
        c.getDetails();
        b.getDetails();

    }

}
