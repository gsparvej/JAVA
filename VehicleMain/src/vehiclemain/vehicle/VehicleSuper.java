

package vehiclemain.vehicle;



public class VehicleSuper {
  
    private String brand;
    private double speed;

    public VehicleSuper() {
    }

    public VehicleSuper(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public void getDetails(){
        System.out.println("Brand Name : "+brand);
        System.out.println("Speed : "+speed);
    
    }
    
}
