
package entity;

public class Customer {
    
    private int id;
    private String customerName;
    private String cell;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int id, String customerName, String cell, String email, String address) {
        this.id = id;
        this.customerName = customerName;
        this.cell = cell;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
    
}
