/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnarraylist;

  
class StudentArray {
    
    private String name;
    private String email;
    private int id;
    private String phone;

    public StudentArray() {
    }

    public StudentArray(String name, String email, int id, String phone) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.phone = phone;
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

    @Override
    public String toString() {
        return "StudentArray{" + "name=" + name + ", email=" + email + ", id=" + id + ", phone=" + phone + '}';
    }
    
    
    
}
