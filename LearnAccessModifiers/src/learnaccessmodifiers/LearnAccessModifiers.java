
package learnaccessmodifiers;

import learnaccessmodifiers.mobile.AndroidMobile;
import learnaccessmodifiers.mobile.Student;


public class LearnAccessModifiers {

    
    public static void main(String[] args) {
        
        AndroidMobile am=new AndroidMobile();
        am.getPrintDetails();
        
        Student s=new Student();
        
        s.setName("Parvej Hossen");
        s.setEmail("parvej@gmail.com");
        s.setId(1287799);
        s.setPhone("0189654854");
        s.setDob("01-01-2025");
        s.setAddress("Dhaka");
        
       
        
        s.getStudentDetails();
    }
    
}
