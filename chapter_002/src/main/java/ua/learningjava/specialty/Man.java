package ua.learningjava.specialty;

/**
 * Profession.
 *
 * @author Stefiniv Pavlo (mailto:Avaltrois@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Man {
    /**
     * Adding the name variable.
     */
    public String name;

    /**
     * Constructor.
     *
     * @param name -object name
     */
    public Man(String name) {
        this.name = name;
    }

    /**
     * Getter.
     *
     * @return name - allows you to use the name variable
     */
    public String getName() {
        return this.name;
    }
}
