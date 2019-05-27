package ua.learningjava.specialty;

/**
 * Doctor.
 *
 * @author Stefiniv Pavlo (mailto:Avaltrois@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class Doctor extends Profession {
    /**
     * Constructor.
     *
     * @param name  - object name
     * @param age   - object age
     * @param skill - object skill
     */
    public Doctor(String name, int age, String skill) {
        super(name, age, skill);
    }

    /**
     * A method that sends a string with an action.
     *
     * @param patient - object
     * @return answer - string with an action
     */
    public String heal(Man patient) {
        String answer = this.name + " " + this.skill + " " + patient.getName();
        return answer;
    }
}

