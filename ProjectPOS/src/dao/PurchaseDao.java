
package dao;

import entity.Category;
import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import projectpos.pos.PosUtil;


public class PurchaseDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    String sql;
    
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
    
    
    public void savePurchase(String name, float unitePrice, int quantity,float totalPrice,String category,String supplierName){
        sql="insert into purchase (name,unitePrice,quantity,totalPrice,category,supplierName,date)"
                + "values(?,?,?,?,?,?,now()";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setFloat(2, unitePrice);
            ps.setInt(3, quantity);
            ps.setFloat(4, totalPrice);
            ps.setString(5, category);
            ps.setString(6, supplierName);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            JOptionPane.showMessageDialog(null, "Purchase Data Saved Successfully ! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Purchase Data Save Unsuccessful ! ");
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
}
