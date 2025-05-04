
package vehiclemain.vehicle;


public class Bike extends VehicleSuper {
    
    private boolean hasCarrier;

    public Bike(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public Bike(boolean hasCarrier, String brand, double speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void getDetails() {
        System.out.println("Details of Bike : ");
        super.getDetails(); 
        System.out.println("Carrier : "+hasCarrier);
    }

    
    
    
}
