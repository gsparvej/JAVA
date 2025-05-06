
package learnmap;


public class Student {
    
    private int id;
    private String stuName;
    private String subject;
    private String teacherName;
    private String tsp;

    public Student() {
    }

    public Student(int id, String stuName, String subject, String teacherName, String tsp) {
        this.id = id;
        this.stuName = stuName;
        this.subject = subject;
        this.teacherName = teacherName;
        this.tsp = tsp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTsp() {
        return tsp;
    }

    public void setTsp(String tsp) {
        this.tsp = tsp;
    }

    @Override
    public String toString() {
        return "\nStudent ID =" + id +
                "\nStudent Name=" + stuName + 
                "\nSubject=" + subject + 
                "\nTeacher Name=" + teacherName + 
                "\nTSP =" + tsp;
    }
    
    
    
    
}
