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
public class DoctorTest extends Profession {
    /**
     * Test add.
     */
    @Test
    public void whenMakeObjectDoctorAndMakeObjectPatient() {
        Doctor doc = new Doctor("Ron", 25, "heals");
        Man patient = new Man("Daniel");
        String result = doc.heal(patient);
        String expected = "Ron heals Daniel";
        assertEquals(result, expected);

    }
}