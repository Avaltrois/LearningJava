package ua.learningjava.specialty;

/**
 * Profession.
 *
 * @author Stefiniv Pavlo (mailto:avaltrois@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Profession {
    /**
     * Adding the age variable.
     */
    public int age;
    /**
     * Adding the name variable.
     */
    public String name;
    /**
     * Adding the skill variable.
     */
    public String skill;

    /**
     * Constructor.
     */
    public Profession() {

    }

    /**
     * Constructor.
     *
     * @param name  -object name
     * @param age   - object age
     * @param skill - object skill
     */
    public Profession(String name, int age, String skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }
}