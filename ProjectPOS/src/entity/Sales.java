
package entity;

import java.util.Date;


public class Sales {
    
    private int id;
    private String customerName;
    private String productName;
    private String category;
    private float unitePrice;
    private float quantity;
    private float totalPrice;
    private float discount;
    private float salesPrice;
    private Date dateAndTime;

    public Sales() {
    }

    public Sales(int id, String customerName, String productName, String category, float unitePrice, float quantity, float totalPrice, float discount, float salesPrice, Date dateAndTime) {
        this.id = id;
        this.customerName = customerName;
        this.productName = productName;
        this.category = category;
        this.unitePrice = unitePrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.discount = discount;
        this.salesPrice = salesPrice;
        this.dateAndTime = dateAndTime;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(float salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    

   
    
    
}
