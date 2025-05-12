
package usinginstanceofinoopinheritanceeightno.instanceOf;


public class WashingMachine extends Appliance{

    public WashingMachine() {
    }

    public WashingMachine(String brand) {
        super(brand);
    }
    
    
    
   public void wash(){
    
        System.out.println("Washing Process...");
    }
    
}
