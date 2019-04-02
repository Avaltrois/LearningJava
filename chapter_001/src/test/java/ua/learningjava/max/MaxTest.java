package ua.learningjava.max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 10);
        assertThat(result, is(10));
    }
    @Test
    public void MaxOfThree() {
        Max maxim = new Max();
        int result = maxim.max(21,11,3);
        assertThat(result, is(21));
    }
}
