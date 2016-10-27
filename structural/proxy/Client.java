package structural.proxy;

/**
 * Created by manish.sharan on 27/10/16
 */
public class Client {

    public static void main(String[] args) {
        User user = new User("manish", "developer");
        User user2 = new User("sharen", "manager");

        IFolder folder = new FolderProxy(user);
        folder.performRW();

        folder = new FolderProxy(user2);
        folder.performRW();
    }
}

/**
 * Philosophy:
 *
 * Proxy pattern provides a protection layer over the main classes having functionality. It creates a cover over it and exposes only the functionalities required with some additional checks.
 * The client would access the proxy instead of the main class and thus proxy would protect the functionalities by putting in restrictions.
 */
