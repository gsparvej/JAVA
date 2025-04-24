
package practiceinheritance.District;


public class Dhaka {
    
    private double area;
    private double zillaList;
    private String estd;
    private double population;
    private double literacyRate;

    public Dhaka() {
    }

    public Dhaka(double area, double zillaList, String estd, double population, double literacyRate) {
        this.area = area;
        this.zillaList = zillaList;
        this.estd = estd;
        this.population = population;
        this.literacyRate = literacyRate;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getZillaList() {
        return zillaList;
    }

    public void setZillaList(double zillaList) {
        this.zillaList = zillaList;
    }

    public String getEstd() {
        return estd;
    }

    public void setEstd(String estd) {
        this.estd = estd;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    public void setLiteracyRate(double literacyRate) {
        this.literacyRate = literacyRate;
    }

    @Override
    public String toString() {
        return "Dhaka{" + "area=" + area + ", zillaList=" + zillaList + ", estd=" + estd + ", population=" + population + ", literacyRate=" + literacyRate + '}';
    }
    
    
}
