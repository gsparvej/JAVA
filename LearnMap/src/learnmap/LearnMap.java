
package learnmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LearnMap {

 
    public static void main(String[] args) {
        
        try {
            
            Scanner s =new Scanner(System.in);
        System.out.print("Enter Student ID : ");
        int id=s.nextInt();
        
        Map<Integer,Student> stuInfo=new HashMap<>();
        
        
        stuInfo.put(1287799,new Student(1287799, "Md. Parvej Hossen", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287470,new Student(1287470, "Md. Eiasin Prodhan", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287675,new Student(1287675, "Md. Rakib Islam", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287829,new Student(1287829, "Md. Imran Hossen", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287528,new Student(1287528, "Md. Parvej Hossen", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287519,new Student(1287519, "Md. RahmatUllah Shahrukh", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287039,new Student(1287039, "Md. Atiqul Islam", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287046,new Student(1287519, "Mrs. halima Akter", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287271,new Student(1287271, "Md. Atiqur Rahman", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287315,new Student(1287315, "Mrs. Sathe Khanom", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287462,new Student(1287462, "Abdullah-Al Masud", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287647,new Student(1287647, "Md. Sadiar Rahman", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287748,new Student(1287748, "Samim Junayet Istique", "JEE", "Emran Hossain", "CCSL"));
        stuInfo.put(1287759,new Student(1287759, "CM Rejaul Karim", "JEE", "Emran Hossain", "CCSL"));
        
        
      //  System.out.println(stuInfo.toString());
            System.err.println("------------------------");
        System.out.println(stuInfo.get(id).toString());
            
        } catch (Exception e) {
            System.err.println("-------------------------");
            System.out.println("Data Not Found !  Try Again ");
        }
        
        
        
        
    }
    
}
