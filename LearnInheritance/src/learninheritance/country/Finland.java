
package learninheritance.country;


public class Finland {
    
    
    private String fincity;
    private double finarea;
    private double finpopulation;
    private String finjob;
    private double finsalary;

    public Finland() {
    }

    public Finland(String fincity, double finarea, double finpopulation, String finjob, double finsalary) {
        this.fincity = fincity;
        this.finarea = finarea;
        this.finpopulation = finpopulation;
        this.finjob = finjob;
        this.finsalary = finsalary;
    }

    public String getFincity() {
        return fincity;
    }

    public void setFincity(String fincity) {
        this.fincity = fincity;
    }

    public double getFinarea() {
        return finarea;
    }

    public void setFinarea(double finarea) {
        this.finarea = finarea;
    }

    public double getFinpopulation() {
        return finpopulation;
    }

    public void setFinpopulation(double finpopulation) {
        this.finpopulation = finpopulation;
    }

    public String getFinjob() {
        return finjob;
    }

    public void setFinjob(String finjob) {
        this.finjob = finjob;
    }

    public double getFinsalary() {
        return finsalary;
    }

    public void setFinsalary(double finsalary) {
        this.finsalary = finsalary;
    }
    
    
    
    
}
