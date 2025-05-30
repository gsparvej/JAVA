

package dao;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entity.Purchase;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    Purchase purchase=new Purchase();
    
    
    //**** ei method evabe koreo kora jabe .....
    
    
//    public void purchaseReportByDate(Date from, Date to,JTable jt){
//    
//        String[] ColoumnName = {"Product Name","Unite Price","Quantity","Total Price","Date And Time","Category","Supplier Name"};
//        DefaultTableModel tableModel = new DefaultTableModel(ColoumnName,0);
//        jt.setModel(tableModel);
//        
//        sql="select * from purchase where dateAndTime between ? and ? ";
//        try {
//            ps=pu.getCon().prepareStatement(sql);
//            ps.setDate(1, from);
//            ps.setDate(2, to);
//            rs=ps.executeQuery();
//            
//            while(rs.next()){
//            String productName=rs.getString("name");
//            float unitePrice=rs.getFloat("unitePrice");
//            float quantity=rs.getFloat("quantity");
//            float totalPrice=rs.getFloat("totalPrice");
//            Date dateAndTime=rs.getDate("dateAndTime");
//            String category=rs.getString("category");
//            String supplierName=rs.getString("supplierName");
//            
//            Object[] rowData={productName,unitePrice,quantity,totalPrice,dateAndTime,category,supplierName};
//            tableModel.addRow(rowData);
//            }
//            
//            rs.close();
//            ps.close();
//            pu.getCon().close();
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    
//    
//    }
    
    
    
    
    // ei method uporer tar bikolpo , evabeo kora jabe........
    
    public List<Purchase>purchaseReportByDate(Date from, Date to,JTable jt){
        List<Purchase>purchaseList=new ArrayList<>();
    
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
    
    return purchaseList;
    }
    
    public void generatePDFReportForPurchase(Date from , Date to , JTable jt){
    
      List<Purchase> purchases=purchaseReportByDate(from, to, jt);
      
       
        
        try {
            // create PDF document.........
            Document document=new Document(PageSize.A4);
            String filePath="Purchase_Report.pdf";
            PdfWriter.getInstance(document, new FileOutputStream(filePath), document);
            document.open();
            
            // Add Title to this Document......
            Font titleFont=FontFactory.getFont(FontFactory.HELVETICA_BOLD,14);
            Paragraph paragraphTitle=new Paragraph("Purchase Report", titleFont);
            paragraphTitle.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(paragraphTitle);
            
            
            // Add Table Headers.........
            PdfPTable table=new PdfPTable(7);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);
            
            // Set Table Coloumn's Width........
            
            float[] coloumnWidths={2.5f,2.5f,2f,2.5f,2.5f,2.5f,2.5f};
            table.setWidths(coloumnWidths);
            
            String[] headers={"Product Name","Unite Price","Quantity","Total Price","Date","Category","Supplier Name"};
            Font headerFont=FontFactory.getFont(FontFactory.HELVETICA_BOLD,12);
            
            for(String header: headers){
            
                PdfPCell headerCell=new PdfPCell(new Phrase(header, headerFont));
                headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                headerCell.setBackgroundColor(BaseColor.DARK_GRAY);
                table.addCell(headerCell);
            
            }
            
            //21: 40 minutes theke suru hbe video....
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

    
}
