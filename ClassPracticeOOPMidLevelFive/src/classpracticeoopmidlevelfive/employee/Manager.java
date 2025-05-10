
package classpracticeoopmidlevelfive.employee;


public class Manager extends Employee{
    
    private int teamSize;

    public Manager() {
    }

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(int teamSize, String name, int id, double salary) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String empDetails() {
        
        return "Manager's Team :"+"\nTeam Size : "+teamSize+"\n"+super.empDetails(); 
    }
    
    
    
}
