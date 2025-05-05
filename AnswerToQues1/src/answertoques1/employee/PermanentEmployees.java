

package answertoques1.employee;

import java.util.Scanner;



public class PermanentEmployees extends Employees{
    
    private int baseSalary;
    private int bonus;

    public PermanentEmployees() {
    }

    public PermanentEmployees(int baseSalary, int bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public PermanentEmployees(int baseSalary, int bonus, String name) {
        super(name);
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
   public double calculateSalary() {
        

        return baseSalary+bonus; 
        
    }

    @Override
   public void displaySalary() {
        
        
        super.displaySalary(); 
    }
}
