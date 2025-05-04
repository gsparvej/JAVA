

package vehiclemain.vehicle;



public class Car extends VehicleSuper {
   
    private int numberOfDoors;

    public Car() {
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(int numberOfDoors, String brand, double speed) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void getDetails() {
        System.out.println("Details of Car : ");
        super.getDetails();
        System.out.println("Number Of Doors : "+numberOfDoors);
    }

    

    
    
    
    
    
}
