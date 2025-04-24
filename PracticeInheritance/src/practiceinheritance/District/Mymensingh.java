
package practiceinheritance.District;


public class Mymensingh extends Dhaka{
    
    private String famousFood;

    public Mymensingh() {
    }

    public Mymensingh(String famousFood) {
        this.famousFood = famousFood;
    }

    public Mymensingh(String famousFood, double area, double zillaList, String estd, double population, double literacyRate) {
        super(area, zillaList, estd, population, literacyRate);
        this.famousFood = famousFood;
    }

    public String getFamousFood() {
        return famousFood;
    }

    public void setFamousFood(String famousFood) {
        this.famousFood = famousFood;
    }
    
   
    
}
