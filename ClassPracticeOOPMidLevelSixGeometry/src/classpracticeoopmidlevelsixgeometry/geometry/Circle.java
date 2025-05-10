
package classpracticeoopmidlevelsixgeometry.geometry;


public class Circle extends Shape{
    
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        
       return Math.PI*Math.pow(radius, 2);
      //  return super.area(); 
    }

    
    
    
}
