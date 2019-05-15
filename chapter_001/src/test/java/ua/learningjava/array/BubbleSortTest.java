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
public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sort = new BubbleSort();
        int[] input = new int[]{8, 9, 7, 3, 1, 0, 5, 4, 2, 6};
        int[] result = sort.sort(input);
        int[] expect = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
}
