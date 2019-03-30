package ua.learningjava.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rublesToDollars(60);
        assertThat(result, is(1));
    }

    @Test
    public void when140RubleToEuroThen2() {
        Converter converter = new Converter();
        int result = converter.rublesToEuros(140);
        assertThat(result, is(2));
    }
    @Test
    public void when2DollarToRubleThen120() {
        Converter converter = new Converter();
        int result = converter.DollarsTorubles(2);
        assertThat(result, is(120));
    }

    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.EurosTorubles(1);
        assertThat(result, is(70));
    }
}
