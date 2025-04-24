
package learninheritance.country;


public class Bangladesh extends Country{
    
    private String person;

    public Bangladesh() {
    }

    public Bangladesh(String person) {
        this.person = person;
    }

    public Bangladesh(String person, String city, double area, double population, String job, double salary, double lifeExpectancy, double literacyRate) {
        super(city, area, population, job, salary, lifeExpectancy, literacyRate);
        this.person = person;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
    
    public void getBangladeshDetails(){
        System.err.println("Details Of "+this.getCity()+": ");
        System.out.println(" City : "+this.getCity()+"\n"
        +" Area : "+this.getArea()+"\n"
        +" Person : "+this.getPerson()+"\n"
        +" Job : "+this.getJob()+"\n"
        +" Life Expectancy : "+this.getLifeExpectancy()+"\n"
        +" Literacy Rate : "+this.getLiteracyRate()+"\n"
        +" Population : "+this.getPopulation()+"\n"
        +" salary : "+this.getSalary()+"\n");
        System.out.println("---------------");
    
    
    
    }
    
    
}
