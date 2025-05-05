

package answertoques1.employee;

import java.util.Scanner;


public class ContractualEmployees extends Employees{
    
     private int workingHour;
    private int hourlyRate;

    public ContractualEmployees() {
    }

    public ContractualEmployees(int workingHour, int hourlyRate) {
        this.workingHour = workingHour;
        this.hourlyRate = hourlyRate;
    }

    public ContractualEmployees(int workingHour, int hourlyRate, String name) {
        super(name);
        this.workingHour = workingHour;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
     @Override
    public void displaySalary() {
        
        
        super.displaySalary(); 
    }

    @Override
    public double calculateSalary() {
        

        return workingHour*hourlyRate; 
    }
}
