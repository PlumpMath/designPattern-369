package behavior.strategy;

/**
 * Created by manish.sharan on 04/09/16
 */
public class Client {

    public static void main(String[] args) {

        Team teamGermany = new Germany("Germany", new DefenseStrategy());
        Team teamBrazil = new Brazil("Brazil", new AttackStrategy());

        //match start
        System.out.println(teamGermany.printInfo());
        System.out.println(teamBrazil.printInfo());

        //after lunch
        teamGermany.setTeamStrategy(new AttackStrategy());
        System.out.println(teamBrazil.printInfo());
        System.out.println(teamGermany.printInfo());
    }

    /*
    Philosophy:
     To associate a behavior/attribute to a class at runtime, it's always better to go using a composition. That is strategy pattern. We could use the same attribute in the
     super class as well, but then all the children classes will have to inherit those methods implicitly which sometime won't make sense. e.g. If there is a animal super class
     and there is a bird and snake child class. We want to add fly attribute to them. We could add the fly attribute to the parent class Animal, but then in
     future if we introduce another class Dog, then even Dog has to inherit the fly attribute and act on it.

     So instead of inheriting a behavior from inheritance, we inherit it via a composition. That is strategy pattern. Making the behavior having a parent-child
     relationship helps us to decide/change the behavior dynamically as well. In this example, the Strategy is inherited via composition in Team class.
     We can dynamically change the strategy for a team, since the Attack and defense strategy are inheriting the Strategy class.
     */

}
