
package dao;

import entity.Category;
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


public class CategoryDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    
    
     public void saveCategory(String name) {

        String sql = "insert into category(name)values(?)";

        try {
            ps = pu.getCon().prepareStatement(sql);
            ps.setString(1, name);
          
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            JOptionPane.showMessageDialog(null, "Data Saved Successfully !");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Save Unsccessful !");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    public void showAllCategory(JTable jt) {

        String[] ColoumnName = {"ID", "Name"};
        DefaultTableModel tableModel = new DefaultTableModel(ColoumnName,0);
        jt.setModel(tableModel);
        
        String sql="select * from category";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            
            
            Object[] rowData={id,name};
            tableModel.addRow(rowData);
            
            }
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void editCategory(int id,String name,JTable jt){
    
        String sql="update category set name=? where id=?";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, id);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            JOptionPane.showMessageDialog(null, " Category Data Edited Successfully ! ");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Category Data Edit Unsuccessfully ! ");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     
     public void deleteCategory(int id, JTable jt){
        
        String sql="delete from category where id=?";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            
            JOptionPane.showMessageDialog(null, " Category Data Deleted Successfully ! ");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Category Data does Not Delete Successfully ! ");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    
    
    
    public List<Category> getAllCategory(){
    
        List<Category> categoryList=new ArrayList<>();
        String sql="select * from category";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
        
                int id=rs.getInt("id");
                String name=rs.getString("name");
                
                categoryList.add(new Category(id, name));
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return categoryList;
    }
}
