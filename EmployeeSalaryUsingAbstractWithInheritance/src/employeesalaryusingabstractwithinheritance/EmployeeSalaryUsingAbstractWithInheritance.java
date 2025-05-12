
package employeesalaryusingabstractwithinheritance;

import employeesalaryusingabstractwithinheritance.employee.Employees;
import employeesalaryusingabstractwithinheritance.employee.FullTimeEmployees;
import employeesalaryusingabstractwithinheritance.employee.PartTimeEmployees;




public class EmployeeSalaryUsingAbstractWithInheritance {

    
    public static void main(String[] args) {
       
      Employees eFull=new FullTimeEmployees(20000, 12000, "Parvej", "26");
      Employees ePart=new PartTimeEmployees(70, 760, "Rakib", "25");
      
        System.out.println("Full Time Employees Details : "+eFull.getDetails());
        System.out.println("--------------------------------------");
        System.out.println("Part Time Employees Details : "+ePart.getDetails());
       
    }
    
}
