package structural.bridge;

/**
 * Created by manish.sharan on 13/09/16.
 */
public class TV extends ElectronicDevice {
    @Override
    public void performAction() {
        System.out.println("TV Muted");
    }
}
