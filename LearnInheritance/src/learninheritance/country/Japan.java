
package learninheritance.country;


public class Japan {
    
    private String city;
    private double area;
    private double population;
    private String job;
    private double salary;

    public Japan() {
    }

    public Japan(String city, double area, double population, String job, double salary) {
        this.city = city;
        this.area = area;
        this.population = population;
        this.job = job;
        this.salary = salary;
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
    
    
    
}
