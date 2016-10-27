package structural.proxy;

/**
 * Created by manish.sharan on 27/10/16
 */
public class Folder implements IFolder{
    @Override
    public void performRW() {
        System.out.println("Performing read-write");
    }
}
