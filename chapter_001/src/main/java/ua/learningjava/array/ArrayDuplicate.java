package ua.learningjava.array;

import java.util.Arrays;

/**
 * Drop duplicates
 * @return array without duplicates
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    in--;
                    unique--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
