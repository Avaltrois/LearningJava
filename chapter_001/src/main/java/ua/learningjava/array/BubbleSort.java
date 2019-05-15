package ua.learningjava.array;

/**
 * Bubble Sort.
 *
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        int temp;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] >= array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
