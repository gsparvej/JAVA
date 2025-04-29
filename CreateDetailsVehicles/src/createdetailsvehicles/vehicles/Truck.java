
package createdetailsvehicles.vehicles;


public class Truck extends Vehicle{
    
    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color, double salePrice) {
        super(speed, regularPrice, color, salePrice);
        this.weight = weight;
    }

    public int getWeight() {
        
        if(weight>2000){
        
        getSalePrice(getRegularPrice()-(getRegularPrice()*0.01));
        }
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
      
        
    }

    private  void getSalePrice(double d) {
       
       
        
        
    }

    
    
    
}
