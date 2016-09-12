package structural.bridge;

/**
 * Created by manish.sharan on 13/09/16.
 */
public class TVRemote extends Remote {

    public TVRemote(ElectronicDevice electronicDevice) {
        super(electronicDevice);
    }

    @Override
    public void pressCenterButton() {
        electronicDevice.performAction();
    }
}
