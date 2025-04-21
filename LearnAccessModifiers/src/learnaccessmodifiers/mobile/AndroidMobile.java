
package learnaccessmodifiers.mobile;


public class AndroidMobile {
    
    Mobile mobile=new Mobile();
    
    String operatingSystem;
    String store;

    public AndroidMobile() {
    }

    public AndroidMobile(String operatingSystem, String store) {
        this.operatingSystem = operatingSystem;
        this.store = store;
    }
    
    public void getPrintDetails(){
    
        mobile.type=" Smart Phone ";
        mobile.buttonStatus=false;
        
        System.out.println(" Operating System "+operatingSystem+" Store :"+store+" Type : "+mobile.type);
    
    }
    
}
