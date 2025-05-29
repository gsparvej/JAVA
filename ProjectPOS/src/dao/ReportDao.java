

package dao;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectpos.pos.PosUtil;



public class ReportDao {
    
    PosUtil pu=new PosUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;
    
    public void purchaseReportByDate(Date from, Date to,JTable jt){
    
        String[] ColoumnName = {"Product Name","Unite Price","Quantity","Total Price","Date And Time","Category","Supplier Name"};
        DefaultTableModel tableModel = new DefaultTableModel(ColoumnName,0);
        jt.setModel(tableModel);
        
        sql="select * from purchase where dateAndTime between ? and ? ";
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setDate(1, from);
            ps.setDate(2, to);
            rs=ps.executeQuery();
            
            while(rs.next()){
            String productName=rs.getString("name");
            float unitePrice=rs.getFloat("unitePrice");
            float quantity=rs.getFloat("quantity");
            float totalPrice=rs.getFloat("totalPrice");
            Date dateAndTime=rs.getDate("dateAndTime");
            String category=rs.getString("category");
            String supplierName=rs.getString("supplierName");
            
            Object[] rowData={productName,unitePrice,quantity,totalPrice,dateAndTime,category,supplierName};
            tableModel.addRow(rowData);
            }
            
            rs.close();
            ps.close();
            pu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

    
}
