package behavior.command;

/**
 * Created by manish.sharan on 08/09/16.
 */
public class CommandExecutor {

    private Command command;

    public CommandExecutor(Command command){
        this.command = command;
    }

    public String doExecution(){
        return command.execute();
    }
}
