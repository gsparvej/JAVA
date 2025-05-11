
package classpracticeoopmidlevelsixgeometry;

import classpracticeoopmidlevelsixgeometry.geometry.Circle;
import classpracticeoopmidlevelsixgeometry.geometry.Rectangle;
import classpracticeoopmidlevelsixgeometry.geometry.Triangle;



public class ClassPracticeOOPMidLevelSixGeometry {

    
    public static void main(String[] args) {
        
        Circle c=new Circle(5);
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        
        
        r.setLength(10);
        r.setWidth(5);
        
        t.setHeight(10);
        t.setBase(20);
        
        
        System.out.println("Circle's Area : "+c.area());
        System.out.println("Rectangle's Area : "+r.area());
        System.out.println("Triangle's Area : "+t.area());
    }
    
}
