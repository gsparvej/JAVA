
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


public class ProductDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    
    
    
    public void showAllProduct(JTable jt) {

        String[] ColoumnName = {"ID", "Name", "ExpiredDate", "CustomerName", "UnitePrice","Quantity","TotalPrice"};
        DefaultTableModel tableModel = new DefaultTableModel(ColoumnName,0);
        jt.setModel(tableModel);
        
        String sql="select * from producttable";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String expiredDate=rs.getString("expiredDate");
            String customerName=rs.getString("customerName");
            String unitePrice=rs.getString("unitePrice");
            String quantity=rs.getString("quantity");
            String totalPrice=rs.getString("totalPrice");
            
            Object[] rowData={name,expiredDate,customerName,unitePrice,quantity,totalPrice};
            tableModel.addRow(rowData);
            
            }
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void saveProduct(String name, String cell, String email, String address) {

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
    
}
