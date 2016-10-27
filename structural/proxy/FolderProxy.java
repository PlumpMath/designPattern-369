package structural.proxy;

/**
 * Created by manish.sharan on 27/10/16
 */
public class FolderProxy implements IFolder {

    private User user;
    private IFolder iFolder;

    public FolderProxy(User user){
        this.user = user;
    }

    @Override
    public void performRW() {
        if(user.getDesgination().equalsIgnoreCase("Manager")) {
            iFolder = new Folder();
            iFolder.performRW();
        }else{
            System.out.println("User is not authorized");
        }
    }
}
