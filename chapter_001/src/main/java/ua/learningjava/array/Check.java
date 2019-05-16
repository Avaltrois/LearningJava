package ua.learningjava.array;

/**
 * The method checks that all elements in the array are the same.
 *
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        int j = 0;
        for (int i = 0; i < data.length/2; i++) {
            if (data[i] == data[data.length - 1 - j] == data[(data.length - 1) / 2]) {
                result = true;
            } else {
                result = false;
            }
            if(result==false)
                break;
            j++;
        }
        return result;
    }
}
