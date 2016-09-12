package structural.bridge;

/**
 * Created by manish.sharan on 13/09/16.
 */
public class DVDPlayer extends ElectronicDevice {
    @Override
    public void performAction() {
        System.out.println("DVD paused");
    }
}
