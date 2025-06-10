
package dao;

import entity.Category;
import entity.Customer;
import entity.Sales;
import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import projectpos.pos.PosUtil;


public class SalesDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;
    
    
    CategoryDao categoryDao=new CategoryDao();
    StockDao stockDao=new StockDao();
    CustomerDao customerDao=new CustomerDao();
    
    
    
    
    
    public void loadCategory(JComboBox<String> comboCategoryList){
    
        comboCategoryList.removeAllItems();
        List<Category> catList=categoryDao.getAllCategory();
        if(catList.isEmpty()){
            System.out.println("Category Not Found ! ");
        }
        for(Category cat:catList){
          
           comboCategoryList.addItem(cat.getName());
        }
        
    
    
    
    }
    
    
    public void loadProduct(JComboBox<String>comboProductList, String category){
    
        comboProductList.removeAllItems();
        List<Stock> stockList=stockDao.getProductByCategory(category);
        if(stockList.isEmpty()){
            System.out.println("Stock Not Found ! ");
        }
        for(Stock s: stockList){
        
            comboProductList.addItem(s.getProductName());
        
        }
    
    }
    
    
    
    public void saveSales(String customerName,String productName, String category, float unitePrice, float quantity,float totalPrice,float discount,float salesPrice){
        sql="insert into sales (customerName,productName,category,unitePrice,quantity,totalPrice,discount,salesPrice,dateAndTime)"
                + "values(?,?,?,?,?,?,?,?,now())";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            
            ps.setString(1, customerName);
            ps.setString(2, productName);
            ps.setString(3, category);
            ps.setFloat(4, unitePrice);
            ps.setFloat(5, quantity);
            ps.setFloat(6, totalPrice);
            ps.setFloat(7, discount);
            ps.setFloat(8, salesPrice);
           
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Sales Successfully ! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "  Unsuccessful ! ");
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
    
    
    
    // save korar eita arekta method, ei style eo kora jay.........***** 
     public void saveSales(Sales sa){
        sql="insert into sales (customerName,productName,category,unitePrice,quantity,totalPrice,discount,salesPrice,dateAndTime)"
                + "values(?,?,?,?,?,?,?,?,now())";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            
            ps.setString(1, sa.getCustomerName());
            ps.setString(2, sa.getProductName());
            ps.setString(3, sa.getCategory());
            ps.setFloat(4, sa.getUnitePrice());
            ps.setFloat(5, sa.getQuantity());
            ps.setFloat(6, sa.getTotalPrice());
            ps.setFloat(7, sa.getDiscount());
            ps.setFloat(8, sa.getSalesPrice());
           
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Sales  Successfully ! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "  Unsuccessful ! ");
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
     public void loadCustomerName(JComboBox<String> comboCustomerList){
    
        comboCustomerList.removeAllItems();
        List<Customer> customers=customerDao.getAllCustomers();
        if(customers.isEmpty()){
            System.out.println("Customer Not Found ! ");
        }
        for(Customer cus : customers){
          
           comboCustomerList.addItem(cus.getCustomerName());
        }
    }
    
    
    
    public void updateStockQuantityByProductNameOnSales(String productName, float quantity){
    
        sql="update stock set quantity=quantity-? where productName=?";
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setFloat(1, quantity);
            ps.setString(2, productName);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
    public List<Sales> getAllSales(){
    
        List<Sales> salesList=new ArrayList<>();
        String sql="select * from sales";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
        
                int id=rs.getInt("id");
                String customerName=rs.getString("customerName");
                String productName=rs.getString("productName");
                String category=rs.getString("category");
                float unitePrice=rs.getFloat("unitePrice");
                float quantity=rs.getFloat("quantity");
                float totalPrice=rs.getFloat("totalPrice");
                float discount=rs.getFloat("discount");
                float salesPrice=rs.getFloat("salesPrice");
                Date dateAndTime=rs.getDate("dateAndTime");
                
                
                
                salesList.add(new Sales(id, customerName, productName, category, unitePrice, quantity, totalPrice, discount, salesPrice, dateAndTime));
                
                
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return salesList;
    }
}
