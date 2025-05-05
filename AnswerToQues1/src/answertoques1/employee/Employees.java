
package answertoques1.employee;

import java.util.Scanner;


public class Employees {
    
     private String name;

    public Employees() {
    }

    public Employees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
     public double calculateSalary(){
    
    return 0;
    }
   public void displaySalary(){

        System.out.println(" Name : "+name+" \n"+"Total Salary : "+calculateSalary());
    }
    
}
