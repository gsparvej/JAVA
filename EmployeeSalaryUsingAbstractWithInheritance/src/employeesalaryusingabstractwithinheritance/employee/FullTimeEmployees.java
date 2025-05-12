
package employeesalaryusingabstractwithinheritance.employee;


public class FullTimeEmployees extends Employees {

    private int baseSalary;
    private int bonus;

    public FullTimeEmployees() {
    }

    public FullTimeEmployees(int baseSalary, int bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public FullTimeEmployees(int baseSalary, int bonus, String name, String age) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String calculateSalary() {
        
        
        return "Salary : "+baseSalary*bonus+getDetails();
    }

    @Override
    public String getDetails() {
        
        
        return "\nName : "+super.name+"\nAge : "+super.age;
    }
    
    
}
