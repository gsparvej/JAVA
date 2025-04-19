
package identifytriangle;


public class Triangle {
    
    double base;
    double height;

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double area(){
    double area=(base*height)/2;
    return area;
    }
    
    
}
