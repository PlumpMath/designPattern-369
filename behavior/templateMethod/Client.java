package behavior.templateMethod;

/**
 * Created by manish.sharan on 13/09/16.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Product Based company");
        JoinCompany joinCompany = new ProductBasedCompany();
        joinCompany.joinCompany();

        System.out.println("Service Based company");
        joinCompany = new ServiceBasedCompany();
        joinCompany.joinCompany();
    }
}

/*
Philosophy:

Template method design pattern identifies a series of steps to be done to do a task, and almost the same task needs to
be done by many classes. So create an abstract template class. Define a template method which the other classes would extend.
The tasks which are unique to every subclass can be made abstract, else the common methods implementation can be given by
the template class itself.

The subclasses can override the functionality of a task in the template class as well and define a overridden behavior as well.


 */
