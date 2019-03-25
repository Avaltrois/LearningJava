package ua.learningjava.calculate;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */

public class CalculateTest {
    @Test
    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Avaltrois";
        String expect = "Echo, echo, echo : Avaltrois";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }
}

