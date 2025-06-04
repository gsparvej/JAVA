package dao;

import entity.Category;
import entity.Sales;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectpos.pos.PosUtil;

public class ProjectDao {

    PosUtil pu = new PosUtil();
    PreparedStatement ps;
    SalesDao salesDao=new SalesDao();

    public void saveCustomer(String name, String cell, String email, String address) {

        String sql = "insert into customer(name,cell,email,address)values(?,?,?,?)";

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
    
//    public void loadCustomerName(JComboBox<String> comboCustomerList){
//    
//        comboCustomerList.removeAllItems();
//        List<Sales> salesList=salesDao.getAllSales();
//        if(salesList.isEmpty()){
//            System.out.println("Category Not Found ! ");
//        }
//        for(Sales sal : salesList){
//          
//           comboCustomerList.addItem(sal.getCustomerName());
//        }
//    }

//    public void showAllCustomer(JTable jt) {
//
//        String[] ColoumnName = {"ID", "Name", "Cell", "Email", "Address"};
//        DefaultTableModel tableModel = new DefaultTableModel(ColoumnName,0);
//        jt.setModel(tableModel);
//        
//        String sql="select * from customer";
//        
//        try {
//            ps=pu.getCon().prepareStatement(sql);
//            ResultSet rs=ps.executeQuery();
//            
//            while(rs.next()){
//            int id=rs.getInt("id");
//            String name=rs.getString("name");
//            String cell=rs.getString("cell");
//            String email=rs.getString("email");
//            String address=rs.getString("address");
//            
//            Object[] rowData={id,name,cell,email,address};
//            tableModel.addRow(rowData);
//            
//            }
//            rs.close();
//            ps.close();
//            pu.getCon().close();
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    
    
    
    public void deleteCustomer(int id, JTable jt){
        
        String sql="delete from customer where id=?";
        
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
    
        String sql="update customer set name=?,cell=?,email=?,address=? where id=?";
        
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
