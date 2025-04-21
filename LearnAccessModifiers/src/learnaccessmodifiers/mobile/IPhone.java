
package learnaccessmodifiers.mobile;


public class IPhone extends Mobile{
    
    String operatingSystem;
    String store;

    public IPhone() {
    }

    public IPhone(String operatingSystem, String store) {
        this.operatingSystem = operatingSystem;
        this.store = store;
    }

    public IPhone(String operatingSystem, String store, String type, boolean displayStatus, boolean buttonStatus, int numberOfCamera, boolean torchStatus) {
        super(type, displayStatus, buttonStatus, numberOfCamera, torchStatus);
        this.operatingSystem = operatingSystem;
        this.store = store;
    }
    
    
}
