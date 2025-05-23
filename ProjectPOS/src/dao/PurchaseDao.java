
package dao;

import entity.Category;
import entity.Stock;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import projectpos.pos.PosUtil;


public class PurchaseDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    
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
    
    
}
