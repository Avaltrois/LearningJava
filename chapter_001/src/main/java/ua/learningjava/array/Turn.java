package ua.learningjava.array;

/**
 * Flip the array.
 *
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[array.length - index - 1];
            array[array.length - index - 1] = array[index];
            array[index] = temp;
        }
        return array;
    }
}

