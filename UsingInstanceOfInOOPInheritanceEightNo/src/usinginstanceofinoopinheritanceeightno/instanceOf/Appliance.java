
package usinginstanceofinoopinheritanceeightno.instanceOf;


public class Appliance {
    
    private String brand;

    public Appliance() {
    }

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
   public void showInfo(){
    
        System.out.println("Appliance Brand : "+brand);
    }
    
}
