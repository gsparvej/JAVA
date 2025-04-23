
package learninheritance;

import learninheritance.country.Country;
import learninheritance.country.Finland;
import learninheritance.country.Japan;



public class LearnInheritance {

    
    public static void main(String[] args) {
        
        Country c=new Country();
        Finland f=new Finland();
        Japan j=new Japan();
        
        
        f.setCity("Helsinki");
        f.setArea(34657);
        f.setBestPlace("Helsinki");
        f.setJob("Java Programming ");
        f.setLifeExpectancy(74.1);
        f.setLiteracyRate(94.75);
        f.setPopulation(30);
        f.setSalary(600000);
        f.setTourism("Helsinki , Turku");
        
        System.out.println("City Name : "+f.getCity());
        System.out.println("Area Of The City : "+f.getArea()+" Square Kilomiter ");
        System.out.println("Famous Place :"+f.getBestPlace());
        System.out.println("Job : "+f.getJob());
        System.out.println("Life Expectancy : "+f.getLifeExpectancy());
        System.out.println("Literacy Rate : "+f.getLiteracyRate());
        System.out.println("Population : "+f.getPopulation());
        System.out.println("Salary : "+f.getSalary());
        System.out.println("Tourist Place : "+f.getTourism());
        
        
    }
    
}
