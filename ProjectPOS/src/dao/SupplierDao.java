
package dao;

import entity.Supplier;
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


public class SupplierDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    
    
    public void saveSupplier(String name, String cell, String email, String address, String contactPerson) {

        String sql = "insert into supplier(name,cell,email,address,contactPerson)values(?,?,?,?,?)";

        try {
            ps = pu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, contactPerson);

            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            JOptionPane.showMessageDialog(null, " Supplier Data Saved Successfully !");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Supplier Data Save Unsccessful !");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void showAllSupplier(JTable jt) {

        String[] ColoumnName = {"ID", "Name", "Cell", "Email", "Address","Contact Person"};
        DefaultTableModel tableModel = new DefaultTableModel(ColoumnName,0);
        jt.setModel(tableModel);
        
        String sql="select * from supplier";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String cell=rs.getString("cell");
            String email=rs.getString("email");
            String address=rs.getString("address");
            String contactPerson=rs.getString("contactPerson");
           
            
            Object[] rowData={id,name,cell,email,address,contactPerson};
            tableModel.addRow(rowData);
            
            }
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void editSupplier(int id,String name, String cell, String email, String address ,String contactPerson,JTable jt){
    
        String sql="update supplier set name=?,cell=?,email=?,address=?,contactPerson=? where id=?";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, contactPerson);
            ps.setInt(6, id);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            JOptionPane.showMessageDialog(null, " Supplier Data Edited Successfully ! ");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Supplier Data Edit Unsuccessfully ! ");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     public void deleteSupplier(int id, JTable jt){
        
        String sql="delete from supplier where id=?";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            
            JOptionPane.showMessageDialog(null, " Supplier Data Deleted Successfully ! ");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Supplier Data does Not Delete Successfully ! ");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
     
     
     
      public void showAllSupplierToPurchaseComboBox(JComboBox<String> supplierComboList) {
          List<Supplier> supplierList=new ArrayList<>();
          supplierComboList.removeAllItems();
          
        String sql="select * from supplier";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String cell=rs.getString("cell");
            String email=rs.getString("email");
            String address=rs.getString("address");
            String contactPerson=rs.getString("contactPerson");
           
            
                Supplier s=new Supplier(id, name, cell, email, address, contactPerson);
                supplierList.add(s);
            
            
            }
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Supplier su: supplierList){
        
            supplierComboList.addItem(su.getName());
        
        }
        
    }
    
}
