
package learnoop;


public class Student {

    String name;
    String email;
    double marks;

    public Student(String atik) {
    }

    public Student(String name, String email, double marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public String getResult(){
    
    if(marks>=33){
    
        return name+" Pass";
    }
    else{
    return name+" Fail";
    }
    
    }
    public double getMarks(){
    return marks;
    }
    public void setMarks(double marks){
    
        this.marks=marks;
    
    }
    
}
