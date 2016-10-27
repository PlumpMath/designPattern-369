package structural.proxy;

/**
 * Created by manish.sharan on 27/10/16
 */
public class User {

    private String userName;
    private String desgination;

    public User(String userName, String desgination){
        this.userName = userName;
        this.desgination = desgination;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesgination() {
        return desgination;
    }

    public void setDesgination(String desgination) {
        this.desgination = desgination;
    }
}
