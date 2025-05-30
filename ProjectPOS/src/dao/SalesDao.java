
package dao;

import entity.Category;
import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    
    
    public void saveSales(String productName, String category, float unitePrice, float quantity,float totalPrice,float discount,float salesPrice){
        sql="insert into sales (productName,category,unitePrice,quantity,totalPrice,discount,salesPrice,dateAndTime)"
                + "values(?,?,?,?,?,?,?,now())";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            
            ps.setString(1, productName);
            ps.setString(2, category);
            ps.setFloat(3, unitePrice);
            ps.setFloat(4, quantity);
            ps.setFloat(5, totalPrice);
            ps.setFloat(6, discount);
            ps.setFloat(7, salesPrice);
           
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Sales Data Saved Successfully ! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "  Unsuccessful ! ");
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
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
}
