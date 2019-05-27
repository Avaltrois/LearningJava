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
public class TeacherTest{
    /**
     * Test add.
     */
    @Test
    public void WhenMakeObjectTeacherAndMakeObjectStudent() {
        Teacher teacher = new Teacher("James", 27, "teaches");
        Man student = new Man("Jes");
        String result = teacher.teaches(student);
        String expected = "James teaches Jes";
        assertEquals(result, expected);

    }

}
