
package dao;

import entity.Customer;
import entity.Sales;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectpos.pos.PosUtil;


public class CustomerDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    
    public void saveCustomer(String customerName,String cell, String email, String address, JTable jt){
    
        String sql="insert into customer(customerName,cell,email,address) values(?,?,?,?)";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, customerName);
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
        
       
        
        String[] ColoumnName={"ID","Customer Name","Cell","Email","Address"};
        DefaultTableModel tableModel=new DefaultTableModel(ColoumnName, 0);
        jt.setModel(tableModel);
        
        String sql="select * from customer ";
        try {
            ps=pu.getCon().prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                int id=rs.getInt("id");
                String customerName=rs.getString("customerName");
                String email=rs.getString("email");
                String cell=rs.getString("cell");
                String address=rs.getString("address");
                
                Object[] rowData={id,customerName,email,cell,address};
                tableModel.addRow(rowData);
            
            }
            
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    
    }
    
    public void deleteCustomer(int id, JTable jt){
    
        String sql="delete from customer where id=?";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully." );
            showAllCustomer(jt);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Deleted Unsuccessful ! Try Again..." );
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    
    }
    
   
    public void editCustomer(int id,String customerName,String cell,String email, String address, JTable jt){
    
        String sql="update customer set customerName=?,cell=?,email=?,address=? where id=?";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
           
            ps.setString(1, customerName);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setInt(5, id);
            
            ps.executeUpdate();
            ps.close();
            pu.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Data Updated Successfully." );
            showAllCustomer(jt);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Update Unsuccessful ! Try Again..." );
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    
    }
    
    
    
     public List<Customer> getAllCustomers(){
    
        List<Customer> customerList=new ArrayList<>();
        String sql="select * from customer";
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
        
                int id=rs.getInt("id");
                String customerName=rs.getString("customerName");
                String cell=rs.getString("cell");
                String email=rs.getString("email");
                String address=rs.getString("address");
                
                customerList.add(new Customer(id, customerName, cell, email, address));
                
                
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return customerList;
    }
     
     public void searchCustomerByAddress(String address, JTable jt){
    
        String[] ColoumnName={"ID","Customer Name","Cell","Email","Address"};
        DefaultTableModel tableModel=new DefaultTableModel(ColoumnName, 0);
        jt.setModel(tableModel);
    
        String sql="select * from customer where address=?";
        if(address.equalsIgnoreCase(address)){
        
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, address);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                tableModel.addRow(new Object[]{
                
                rs.getInt("id"),
                rs.getString("customerName"),
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
    
}
