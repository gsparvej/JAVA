
package exampracticeinheritancefifthmay.details;


public class Student extends PersonClass {
    
    private int studentId;

    public Student() {
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    

    @Override
    public String getStuDetails() {
      
        return " Name :"+getName()+" Age :"+getAge()+" Student ID : "+getStudentId();
        
        
    }
    
    
    
}
