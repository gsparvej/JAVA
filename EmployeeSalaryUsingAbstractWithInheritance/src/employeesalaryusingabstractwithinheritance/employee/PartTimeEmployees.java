
package employeesalaryusingabstractwithinheritance.employee;


 
public class PartTimeEmployees extends Employees{
    
    
    private int workingHour;
    private int hourlyRate;

    public PartTimeEmployees() {
    }

    public PartTimeEmployees(int workingHour, int hourlyRate) {
        this.workingHour = workingHour;
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployees(int workingHour, int hourlyRate, String name, String age) {
        super(name, age);
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
    public String calculateSalary() {
        
        return workingHour*hourlyRate+getDetails();
    }

    @Override
    public String getDetails() {
        
        
      return "\nName : "+super.name+"\nAge : "+super.age;
    }
}
