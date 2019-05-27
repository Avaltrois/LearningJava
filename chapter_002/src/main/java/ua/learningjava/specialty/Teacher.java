package ua.learningjava.specialty;

/**
 * Teacher.
 *
 * @author Stefiniv Pavlo (mailto:Avaltrois@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class Teacher extends Profession {
    /**
     * Constructor.
     *
     * @param name  -object name
     * @param age   -object age
     * @param skill -object skill
     */
    public Teacher(String name, int age, String skill) {
        super(name, age, skill);
    }

    /**
     * A method that sends a string with an action.
     *
     * @param student - object
     * @return answer - string with an action
     */
    public String teaches(Man student) {
        String result = this.name + " " + this.skill + " " + student.getName();
        return result;
    }
}
