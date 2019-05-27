package ua.learningjava.specialty;

/**
 * Engineer.
 *
 * @author Stefiniv Pavlo (mailto:Avaltrois@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class Engineer extends Profession {
    /**
     * Constructor.
     *
     * @param name  - object name
     * @param age   - object age
     * @param skill - object skill
     */
    public Engineer(String name, int age, String skill) {
        super(name, age, skill);
    }

    /**
     * A method that sends a string with an action.
     *
     * @param man - object
     * @return answer - string with an action
     */
    public String calculate(Man man) {
        String answer = this.name + " " + this.skill + " for " + man.getName();
        return answer;
    }
}
