
package learninheritance;

import learninheritance.country.Bangladesh;
import learninheritance.country.Country;
import learninheritance.country.Finland;
import learninheritance.country.Japan;



public class LearnInheritance {

    
    public static void main(String[] args) {
        
      //  Country c=new Country();
        Finland f=new Finland();
        Japan j=new Japan();
        Bangladesh b=new Bangladesh();
        
        
        f.setCity("Helsinki");
        f.setArea(34657);
        f.setBestPlace("Helsinki");
        f.setJob("Java Programming ");
        f.setLifeExpectancy(74.1);
        f.setLiteracyRate(94.75);
        f.setPopulation(30);
        f.setSalary(600000);
        f.setTourism("Helsinki , Turku");
        
        
        j.setCity("Tokio");
        j.setArea(67532);
        j.setBestFood("Noodles");
        j.setJob("Python Programming ");
        j.setLifeExpectancy(78.1);
        j.setLiteracyRate(96.75);
        j.setPopulation(35);
        j.setSalary(705000);
        j.setFlower("Blossom , Sakura");
        
        b.setCity("Dhaka");
        b.setArea(8786);
        b.setPerson("Dr. MD. Yunus ");
        b.setJob("Java Programming ");
        b.setLifeExpectancy(71.2);
        b.setLiteracyRate(81.75);
        b.setPopulation(130);
        b.setSalary(60900);
        
        b.getBangladeshDetails();
       
        
        
        System.out.println("Details Of "+f.getCity()+":");
        System.out.println("City Name : "+f.getCity());
        System.out.println("Area Of The City : "+f.getArea()+" Square Kilomiter ");
        System.out.println("Famous Place :"+f.getBestPlace());
        System.out.println("Job : "+f.getJob());
        System.out.println("Life Expectancy : "+f.getLifeExpectancy());
        System.out.println("Literacy Rate : "+f.getLiteracyRate());
        System.out.println("Population : "+f.getPopulation());
        System.out.println("Salary : "+f.getSalary());
        System.out.println("Tourist Place : "+f.getTourism());
        
        System.out.println("----------------------");
        
        System.out.println("Details Of "+j.getCity()+":");
        System.out.println("City Name : "+j.getCity());
        System.out.println("Area Of The City : "+j.getArea()+" Square Kilomiter ");
        System.out.println("Famous Place :"+j.getBestFood());
        System.out.println("Job : "+j.getJob());
        System.out.println("Life Expectancy : "+j.getLifeExpectancy());
        System.out.println("Literacy Rate : "+j.getLiteracyRate());
        System.out.println("Population : "+j.getPopulation());
        System.out.println("Salary : "+j.getSalary());
        System.out.println("Famous Flower : "+j.getFlower());
        
        
    }
    
}
