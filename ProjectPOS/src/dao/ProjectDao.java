package dao;

import java.sql.PreparedStatement;
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
        DefaultTableModel tableModel = new DefaultTableModel();
        jt.setModel(tableModel);
        
        String sql="";
    }
}
