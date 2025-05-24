
package dao;

import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectpos.pos.PosUtil;


public class StockDao {
    
    PosUtil pu = new PosUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;
    
    public List<Stock> getProductByCategory(String category){
    
        List<Stock> stockList=new ArrayList<>();
        sql="select * from stock where category=?";
        try {
            ps=pu.getCon().prepareStatement(sql);
            ps.setString(1, category);
            rs=ps.executeQuery();
            while(rs.next()){
            
                Stock s=new Stock(rs.getInt("id"),
                        rs.getString("productName"),
                        rs.getString("category"),
                        rs.getFloat("quantity")
                );
                stockList.add(s);
                
                
                
                
                
//               int id=rs.getInt("id");
//               String productName=rs.getString("productName");
//                category=rs.getString("category");
//                Float quantity=rs.getFloat("quantity");   


                
                
                
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    
    
    return stockList;
    }
    
    
}
