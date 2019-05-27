package ua.learningjava.specialty;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Test.
 *
 * @author Stefiniv Pavlo (mailto:Avaltrois@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class EngineerTest extends Profession {
    /**
     * Test add.
     */
    @Test
    public void whenMakeObjectEngineerAndMakeObjectClient() {
        Engineer eng = new Engineer("Elvis", 40, "builds a house");
        Man client = new Man("Michell");
        String result = eng.calculate(client);
        String expected = "Elvis builds a house for Michell";
        assertEquals(result, expected);
    }
}