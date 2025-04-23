
package learninheritance.country;


public class Japan extends Country{
  
    private String flower;
    private String bestFood;

    public Japan() {
    }

    public Japan(String flower, String bestFood) {
        this.flower = flower;
        this.bestFood = bestFood;
    }

    public Japan(String flower, String bestFood, String city, double area, double population, String job, double salary, double lifeExpectancy, double literacyRate) {
        super(city, area, population, job, salary, lifeExpectancy, literacyRate);
        this.flower = flower;
        this.bestFood = bestFood;
    }
    
    
    
    
    
}
