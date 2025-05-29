
package entity;

import java.util.Date;


public class Purchase {
    
    private int id;
    private String name;
    private float unitePrice;
    private float quantity;
    private float totalPrice;
    private Date dateAndTime;
    private String category;
    private String supplierName;

    public Purchase() {
    }

    public Purchase( String name, float unitePrice, float quantity, float totalPrice, Date dateAndTime, String category, String supplierName) {
       
        this.name = name;
        this.unitePrice = unitePrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.dateAndTime = dateAndTime;
        this.category = category;
        this.supplierName = supplierName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(float unitePrice) {
        this.unitePrice = unitePrice;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    
  
}
