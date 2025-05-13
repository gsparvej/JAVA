

package usingpolymorphismwitharrayoopinheritanceeleven.geometry;



public class Circle extends Shape{
    
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String area() {
        
        return "Circle's Area : "+Math.PI*Math.pow(radius, 2); 
    }
    
    
}
