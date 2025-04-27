
package learnarraylist;

import java.util.ArrayList;


public class LearnArrayList {

   
    public static void main(String[] args) {
        
        
        ArrayList<StudentArray> studentsList=new ArrayList<>();
        
        StudentArray s=new StudentArray("Eiasin", "eiasin@gmail.com", 1287745, "+880179-674523");
        
        studentsList.add(new StudentArray("Md. Parvej Hossen", "parvej@gmail.com", 1287799, "+8801906-600275"));
        studentsList.add(s);
        studentsList.add(new StudentArray("Rakib", "rakib@gmail.com", 1286644, "+880153-907856"));
        
        
     //  studentsList.remove(s);
        
        System.out.println(""+studentsList);
        
        System.out.println("-----------------------------------");
        
        for(StudentArray student : studentsList){
        
            System.out.println(""+student);
        }
        
    
    }
    
}
