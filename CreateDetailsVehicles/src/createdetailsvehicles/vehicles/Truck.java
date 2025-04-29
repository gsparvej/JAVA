
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

   

    public void setWeight(int weight) {
        this.weight = weight;
      
        
    }

    @Override
    public double getSalePrice() {
        
        
        if(weight>2000){
        
          return getRegularPrice()-(getRegularPrice()*0.1);
          
          
        }
        else {
        
        return getRegularPrice();
        }
        

    }

   

    
    
    
}
