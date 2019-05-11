package ua.learningjava.array;

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
public class SquareTest {
    @Test
    public void whenBound4Then0149() {
        int bound = 4;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{0, 1, 4, 9};
        assertThat(rst, is(expect));
    }

}


