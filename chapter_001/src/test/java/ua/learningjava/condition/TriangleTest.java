package ua.learningjava.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // create three objects of class Point.
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        // Create a triangle object and pass point objects into it.
        Triangle triangle = new Triangle(a, b, c);
        // Calculate the area.
        double result = triangle.area();
        // We set the expected result.
        double expected = 2D;
        //Check the result and the expected value.
        assertThat(result, closeTo(expected, 0.1));
    }
}
