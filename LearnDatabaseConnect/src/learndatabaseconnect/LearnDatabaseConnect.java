
package learndatabaseconnect;

import java.util.logging.Level;
import java.util.logging.Logger;


public class LearnDatabaseConnect {

   
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LearnDatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
