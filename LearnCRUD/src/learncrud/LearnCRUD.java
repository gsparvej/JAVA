
package learncrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import learncrud.util.CrudUtil;


public class LearnCRUD {

    public static CrudUtil cu=new CrudUtil();
    public static PreparedStatement ps;
    public static String sql;
    
    public static void main(String[] args) {
        
        
       // saveStudent("Atik", "Arts");
       // saveStudent("Reja", "Arts");
       // saveStudent("Rahmat", "Business");
  //  viewStudents();
       // updateStudent(6, "Parvej Hossen", "Science");
      //  viewStudents();
        deleteStudents(4);
        viewStudents();
        
    }
    
    public static void saveStudent(String name, String group){
    
    sql="insert into students(name, groupName) values(?,?)";
    
        try {
            ps=cu.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, group);
            
            ps.executeUpdate();
            
            
            ps.close();
            cu.getCon().close();
            System.out.println("Data Inserted Successfully ! ");
        } catch (SQLException ex) {
             System.out.println("Data Insert Unsuccessful Try Again... ! ");
            Logger.getLogger(LearnCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public static void viewStudents(){
    sql="select * from students";
    
        try {
            ps=cu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String group=rs.getString("groupName");
                
                System.out.println("ID : "+id+
                        "\nName : "+name+
                        "\nGroup : "+group);
                System.out.println("------------------");
            
            }
            ps.executeQuery();
            ps.close();
            cu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(LearnCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    public static void updateStudent(int id,String name, String groupName){
    
        sql="update students set name=? ,groupName=? where id=? ";
        
        try {
            ps=cu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, groupName);
           ps.setInt(3, id);
           
           ps.executeUpdate();
           ps.close();
           cu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(LearnCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void deleteStudents(int id){
    sql="delete from students where id=?";
    
        try {
            ps=cu.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            cu.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(LearnCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
