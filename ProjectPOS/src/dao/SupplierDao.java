
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
    
}
