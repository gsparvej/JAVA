
package learndatabaseconnect;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import learndatabaseconnect.database.DbUtil;



public class LearnDatabaseConnect {

   
    public static void main(String[] args) {
        
        DbUtil db=new DbUtil();
        
        String insertSql="insert into student(name, email, address)"+"values(?,?,?)";
      
        try {
            PreparedStatement ps=db.getCon().prepareStatement(insertSql);
            
            ps.setString(1, "Md Rakib Islam");
            ps.setString(2, "rakib@gmail.com");
            ps.setString(3, "Dhaka");
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            System.out.println("done ");
            
        } catch (SQLException ex) {
            Logger.getLogger(LearnDatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
