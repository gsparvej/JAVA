
package learnaccessmodifiers.mobile;


public class Student {
    
    
    private String name;
    private String email;
    private int id;
    private String phone;
    private String address;
    private String dob;

    public Student() {
    }

    public Student(String name, String email, int id, String phone, String address, String dob) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public void getStudentDetails(){
    
        System.out.println("Name :"+this.name+"\n"
                +"Email :"+this.email+"\n"
        +"ID :"+this.id+"\n"
                +"Phone :"+this.phone+"\n"
        +"Address :"+this.address+"\n"
        +"DOB :"+this.dob);
    
    }

  
}
