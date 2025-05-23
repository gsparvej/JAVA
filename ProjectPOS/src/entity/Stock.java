
package entity;

public class Stock {
    
    private int id;
    private String productName;
    private String category;
    private String quantity;

    public Stock() {
    }

    public Stock(int id, String productName, String category, String quantity) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", productName=" + productName + ", category=" + category + ", quantity=" + quantity + '}';
    }
    
    
    
}
