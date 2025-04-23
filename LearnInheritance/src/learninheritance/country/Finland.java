
package learninheritance.country;


public class Finland {
  
private String bestPlace;
private String tourism;

    public Finland() {
    }

    public Finland(String bestPlace, String tourism) {
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


    
}
