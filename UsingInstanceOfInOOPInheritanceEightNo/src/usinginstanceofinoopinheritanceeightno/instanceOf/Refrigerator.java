
package usinginstanceofinoopinheritanceeightno.instanceOf;


public class Refrigerator extends Appliance{

    public Refrigerator() {
    }

    public Refrigerator(String brand) {
        super(brand);
    }

    
    
   public void cool(){
    
    
        System.out.println("Cooling Process...");
    }
    @Override
   public void showInfo() {
        super.showInfo(); 
    }
    
    
}
