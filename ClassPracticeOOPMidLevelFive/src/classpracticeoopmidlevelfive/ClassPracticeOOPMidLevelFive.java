
package classpracticeoopmidlevelfive;

import classpracticeoopmidlevelfive.employee.Employee;
import classpracticeoopmidlevelfive.employee.Manager;


public class ClassPracticeOOPMidLevelFive {

    
    public static void main(String[] args) {
        
        
      
        Manager m=new Manager(5);
        
      
        
        m.setName("Parvej");
        m.setId(1287799);
        m.setSalary(35000);
        m.setTeamSize(5);
        
        System.out.println(""+m.empDetails());
    }
    
}
