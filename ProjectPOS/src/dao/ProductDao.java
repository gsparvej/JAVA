
package dao;

import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectpos.pos.PosUtil;


public class ProductDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    CategoryDao categoryDao=new CategoryDao();
    
    
    
    public void showAllProduct(JTable jt) {

        String[] ColoumnName = {"ID", "Product Name", "Category"};
        DefaultTableModel tableModel = new DefaultTableModel(ColoumnName,0);
        jt.setModel(tableModel);
        
        String sql="select * from product";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            int id=rs.getInt("id");
            String productName=rs.getString("productName");
            String category=rs.getString("category");
           
            Object[] rowData={id,productName,category};
            tableModel.addRow(rowData);
            
            }
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void saveProduct(String productName, String category) {

        String sql = "insert into product (productName,category)values(?,?)";

        try {
            ps = pu.getCon().prepareStatement(sql);
            ps.setString(1, productName);
            ps.setString(2, category);

            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            JOptionPane.showMessageDialog(null, " Product Data Saved Successfully !");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Product Data Not Save !");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     public void loadCategoryToProductComboBox(JComboBox<String> catList){
     
         catList.removeAllItems();
         List<Category> categories=new ArrayList<>();
         categories=categoryDao.getAllCategory();
         
         for(Category c: categories){
         
             catList.addItem(c.getName());
         }
         
     
     
     
     
     }
    
}
