package behavior.command;

/**
 * Created by manish.sharan on 08/09/16.
 */
public class CommandInvoker {

    private CommandExecutor commandExecutor;

    public CommandInvoker(CommandExecutor commandExecutor){
        this.commandExecutor = commandExecutor;
    }

    public String passCommandToExecute(){
        return commandExecutor.doExecution();
    }
}
