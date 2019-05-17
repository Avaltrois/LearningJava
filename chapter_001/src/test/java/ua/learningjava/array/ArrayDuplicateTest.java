package ua.learningjava.array;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{"Hello", "Wonderful", "Hello", "World", "Wonderful"};
        String[] result = duplicate.remove(input);
        String[] expect = new String[]{"Hello", "Wonderful", "World"};
        assertThat(result, arrayContainingInAnyOrder(expect));

    }
    @Test
    public void whenAllArrayAreDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{"1", "1", "1", "1", "1"};
        String[] result = duplicate.remove(input);
        String[] expect = new String[]{"1"};
        assertThat(result, arrayContainingInAnyOrder(expect));

    }

}
