
package employeesalaryusingabstractwithinheritance.employee;


public abstract class Employees {
   
    String name;
    String age;

    public Employees() {
    }

    public Employees(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public abstract String getDetails();
    
    public abstract int calculateSalary();
    
    
}
