package ua.learningjava.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSub4Minus2Then2() {
        Calculator calc = new Calculator();
        double result = calc.sub(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMult2On2Then4() {
        Calculator calc = new Calculator();
        double result = calc.mult(2D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDiv2On2Then1() {
        Calculator calc = new Calculator();
        double result = calc.div(2D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
}
