

package learnaccessmodifiers.mobile;



public class Mobile {
    
    String type;
    boolean displayStatus;
    boolean buttonStatus;
    int numberOfCamera;
    boolean torchStatus;

    public Mobile() {
    }

    public Mobile(String type, boolean displayStatus, boolean buttonStatus, int numberOfCamera, boolean torchStatus) {
        this.type = type;
        this.displayStatus = displayStatus;
        this.buttonStatus = buttonStatus;
        this.numberOfCamera = numberOfCamera;
        this.torchStatus = torchStatus;
    }
    
    
    
}
