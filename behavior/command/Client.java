package behavior.command;

/**
 * Created by manish.sharan on 08/09/16.
 */
public class Client {

    public static void main(String[] args) {
        Command command = new ApproveCommand();
        CommandExecutor commandExecutor = new CommandExecutor(command);

        CommandInvoker commandInvoker = new CommandInvoker(commandExecutor);
        System.out.println(commandInvoker.passCommandToExecute());

        command = new RejectCommand();
        commandExecutor = new CommandExecutor(command);
        commandInvoker = new CommandInvoker(commandExecutor);
        System.out.println(commandInvoker.passCommandToExecute());
    }


    /*
    Philosophy:

    This patterns comprises of 4 subjects,
    a. Command (inherited by actual command subclasses to be executed),
    b. Command Executor (Which takes a Command Instance and invokes the execute method of command)
    c. Command Invoker (which takes a Command Executor and invokes it)
    d. Client

    The Client creates the Command to execute, creates command executor and passes the command object to it, creates command invoker and passes the command executor
    to it. Finally it asks command invoer to invoke the execution.
    It is synonymous to a customer in a hotel (client) which calls the waiter (invoker). The customer chooses food (Command) and creates an order (command invoker)
    and passes the order via the waiter. The waiter need not have any idea of the food he has ordered. He just takes the order and passes it to the backend
    where the order will get executed (command invoker would invoke the command).

    So the path is like:
    
    Client (passes command wrapped in receiver) -------------------> Invoker (triggers invoke command on receiver)
    ----------------> Receiver (invokes the command) -----------------> Command (command is executed)

     */
}
