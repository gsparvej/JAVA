
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


public class CustomerDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    
    public void saveCustomer(String name,String cell, String email, String address, JTable jt){
    
        String sql="insert into customer(name,cell,email,address) values(?,?,?,?)";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            JOptionPane.showMessageDialog(null, "Save Succesfully ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ! Unsuccesful ! Please Try Again ... ");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    public void showAllCustomer(JTable jt){
        
       
        
        String[] ColoumnName={"ID","Name","Cell","Email","Address"};
        DefaultTableModel tableModel=new DefaultTableModel(ColoumnName, 0);
        jt.setModel(tableModel);
        
        String sql="select * from customer ";
        try {
            ps=pu.getCon().prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("email");
                String cell=rs.getString("cell");
                String address=rs.getString("address");
                
                Object[] rowData={id,name,email,cell,address};
                tableModel.addRow(rowData);
            
            }
            
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    
    }
    
    
    
   
    
}
