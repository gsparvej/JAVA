
package FirstClassOOP;


public class Circle {
    
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double area(){
    double area=Math.PI*Math.pow(radius, 2);
    return area;
    }
    public double perimeter(){
    double perimeter=2*Math.PI*radius;
    return perimeter;
    }
    
}
