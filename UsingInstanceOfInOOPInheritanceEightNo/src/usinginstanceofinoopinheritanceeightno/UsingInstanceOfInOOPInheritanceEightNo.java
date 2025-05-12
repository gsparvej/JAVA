
package usinginstanceofinoopinheritanceeightno;

import usinginstanceofinoopinheritanceeightno.instanceOf.Appliance;
import usinginstanceofinoopinheritanceeightno.instanceOf.Refrigerator;
import usinginstanceofinoopinheritanceeightno.instanceOf.WashingMachine;


public class UsingInstanceOfInOOPInheritanceEightNo {

    
    public static void main(String[] args) {
        
        WashingMachine w=new WashingMachine();
        Refrigerator r=new Refrigerator();
        
        Appliance[] appliances = {
            new WashingMachine("LG"),
            new Refrigerator("Samsung"),
            new WashingMachine("Whirlpool"),
            new Refrigerator("Haier")
        };
        
        for(Appliance appliance:appliances){
        
            appliance.showInfo();
            
            if(appliance instanceof WashingMachine){
            
                System.out.println("This is Washing Machine ");
                w.wash();
            }
            else if(appliance instanceof Refrigerator){
            
                System.out.println("This is Refrigerator ");
                r.cool();
            }
            System.out.println("------------------------");
            
        
        }
    }
    
}
