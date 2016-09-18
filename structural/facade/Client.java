package structural.facade;

/**
 * Created by manish.sharan on 19/09/16
 */
public class Client {

    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade(100001);
        bankFacade.deposit(100);
        bankFacade.deposit(500);
        bankFacade.findBalance();
        bankFacade.withdraw(300);
        bankFacade.withdraw(10000);
    }
}
/*

Philosophy:

Facade design pattern creates a facade between client and the backend systems. The facade is one point interaction for the client
and client is not aware of how many and what processing goes on internally. There could be multiple operations going on while the
client makes a single request, e.g on deposit, there is a validation of account and then deposit. Client would not be aware of the
validation and banking serivces interaction behind the scenes.

Tomorrow if the internals of banking changes, still client would continue to work with the facade without worrying about the changes
internally.

 */
