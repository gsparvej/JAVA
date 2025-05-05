
package answertoques1;

import answertoques1.employee.ContractualEmployees;
import answertoques1.employee.PermanentEmployees;


public class AnswerToQues1 {

    
    public static void main(String[] args) {
        
        
        PermanentEmployees pe=new PermanentEmployees();
        ContractualEmployees ce=new ContractualEmployees();
        
        pe.setBaseSalary(30000);
        pe.setBonus(15000);
        pe.setName("Parvej");
        ce.setHourlyRate(750);
        ce.setWorkingHour(70);
        ce.setName("Rakib");
        
        pe.displaySalary();
        System.out.println("-----------------");
        ce.displaySalary();
    }
    
}
