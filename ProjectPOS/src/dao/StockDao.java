
package dao;

import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectpos.pos.PosUtil;


public class StockDao {
    
    PosUtil pu = new PosUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;
    
    public List<Stock> getProductByCategory(String category){
    
        List<Stock> stockList=new ArrayList<>();
        sql="select * from stock where category=?";
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, category);
            rs=ps.executeQuery();
            while(rs.next()){
            
                Stock s=new Stock(rs.getInt("id"),
                        rs.getString("productName"),
                        rs.getString("category"),
                        rs.getFloat("quantity")
                );
                stockList.add(s);      
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return stockList;
    }
    
    
    public void updateStockQuantityByProductName(String productName, float quantity){
    
        sql="update stock set quantity=quantity+? where productName=?";
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
    
    public void saveStock(String productName, float quantity, String category){
    
        sql="insert into stock (productName,quantity,category)values(?,?,?)";
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, productName);
            ps.setFloat(2, quantity);
            ps.setString(3, category);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
          
            
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     public void showAllStock(JTable jt) {

        String[] ColoumnName = {"ID", "Product Name", "Category","Quantity"};
        DefaultTableModel tableModel = new DefaultTableModel(ColoumnName,0);
        jt.setModel(tableModel);
        
         sql="select * from stock order by productName ";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
            int id=rs.getInt("id");
            String productName=rs.getString("productName");
            String category=rs.getString("category");
            float quantity=rs.getFloat("quantity");
           
            Object[] rowData={id,productName,category,quantity};
            tableModel.addRow(rowData);
            
            }
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
