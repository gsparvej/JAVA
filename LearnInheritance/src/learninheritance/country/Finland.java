
package learninheritance.country;


public class Finland extends Country{
  
private String bestPlace;
private String tourism;

    public Finland() {
    }

    public Finland(String bestPlace, String tourism) {
        this.bestPlace = bestPlace;
        this.tourism = tourism;
    }

    public Finland(String bestPlace, String tourism, String city, double area, double population, String job, double salary, double lifeExpectancy, double literacyRate) {
        super(city, area, population, job, salary, lifeExpectancy, literacyRate);
        this.bestPlace = bestPlace;
        this.tourism = tourism;
    }

    public String getBestPlace() {
        return bestPlace;
    }

    public void setBestPlace(String bestPlace) {
        this.bestPlace = bestPlace;
    }

    public String getTourism() {
        return tourism;
    }

    public void setTourism(String tourism) {
        this.tourism = tourism;
    }
    
    public void getDetailsFinland(){

        System.out.println(" ");

}
   

    
}
