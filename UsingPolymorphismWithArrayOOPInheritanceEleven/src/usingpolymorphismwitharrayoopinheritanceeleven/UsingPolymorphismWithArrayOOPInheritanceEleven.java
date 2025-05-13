
package usingpolymorphismwitharrayoopinheritanceeleven;

import usingpolymorphismwitharrayoopinheritanceeleven.geometry.Circle;
import usingpolymorphismwitharrayoopinheritanceeleven.geometry.Rectangle;
import usingpolymorphismwitharrayoopinheritanceeleven.geometry.Shape;
import usingpolymorphismwitharrayoopinheritanceeleven.geometry.Triangle;

public class UsingPolymorphismWithArrayOOPInheritanceEleven {

    
    public static void main(String[] args) {
        
        
       
        
        Shape[] shapes=new Shape[3];
        
   //     shapes [0]=new Circle(5);
        
       shapes[0]=new Circle(5);
       shapes[1]=new Rectangle(10, 8);
       shapes[2]=new Triangle(20, 12);
       
        
        for(int i=0;i<shapes.length;i++){
        
            System.out.println(shapes[i].area());
        
        }
        
    }
    
}
