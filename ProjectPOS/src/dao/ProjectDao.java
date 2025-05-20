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

public class ProjectDao {

    PosUtil pu = new PosUtil();
    PreparedStatement ps;

    public void saveCustomer(String name, String cell, String email, String address) {

        String sql = "insert into projecttable(name,cell,email,address)values(?,?,?,?)";

        try {
            ps = pu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);

            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            JOptionPane.showMessageDialog(null, "Data Saved Successfully !");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Save Unsccessful !");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showAllCustomer(JTable jt) {

        String[] ColoumnName = {"ID", "Name", "Cell", "Email", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(ColoumnName,0);
        jt.setModel(tableModel);
        
        String sql="select * from projecttable";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String cell=rs.getString("cell");
            String email=rs.getString("email");
            String address=rs.getString("address");
            
            Object[] rowData={id,name,cell,email,address};
            tableModel.addRow(rowData);
            
            }
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void searchCustomerByAddress(String address, JTable jt){
    
        String[] ColoumnName={"ID","Name","Cell","Email","Address"};
        DefaultTableModel tableModel=new DefaultTableModel(ColoumnName, 0);
        jt.setModel(tableModel);
    
        String sql="select * from projecttable where address=?";
        if(address.equalsIgnoreCase(address)){
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, address);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                tableModel.addRow(new Object[]{
                
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("cell"),
                rs.getString("email"),
                rs.getString("address")}
                
                );  
            
            }
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Does not match Address ... Try Again ! ");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
        
        JOptionPane.showMessageDialog(null, " ! Not Found ! Address does not matched .... Try again ...  ");
        }
    
    
    }
    
    public void deleteCustomer(int id, JTable jt){
        
        String sql="delete from projecttable where id=?";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully ! ");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data does Not Delete Successfully ! ");
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public void editCustomer(int id,String name, String cell, String email, String address ,JTable jt){
    
        String sql="update projecttable set name=?,cell=?,email=?,address=? where id=?";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setInt(5, id);
            
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
