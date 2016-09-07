package behavior.command;

/**
 * Created by manish.sharan on 08/09/16.
 */
public class ApproveCommand implements Command {
    @Override
    public String execute() {
        return "Action is approved";
    }
}
