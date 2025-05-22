
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    public void editCategory(int id,String name, String cell, String email, String address ,JTable jt){
    
        String sql="update category set name=? where id=?";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, id);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            JOptionPane.showMessageDialog(null, "Data Edited Successfully ! ");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Edite Unsuccessfully ! ");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
