
package learninheritance.country;


public class Country {
    
    
    private String city;
    private double area;
    private double population;
    private String job;
    private double salary;
    private double lifeExpectancy;
    private double literacyRate;

    public Country() {
    }

    public Country(String city, double area, double population, String job, double salary, double lifeExpectancy, double literacyRate) {
        this.city = city;
        this.area = area;
        this.population = population;
        this.job = job;
        this.salary = salary;
        this.lifeExpectancy = lifeExpectancy;
        this.literacyRate = literacyRate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    public void setLiteracyRate(double literacyRate) {
        this.literacyRate = literacyRate;
    }
    
    
    
    
}
