package ua.learningjava.array;

/**
 * The method checks that all elements in the diagonals are true.
 *
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int q = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][i] == true) {
                for (int j = 0; j < data.length; j++) {
                    if (i + j == data.length - 1) {
                        if (data[i][j] == data[q][data.length - 1 - q] == data[data.length / 2][data.length / 2]) {
                            result = true;
                        } else {
                            result = false;
                        }
                        if (result == false)
                            break;
                    }
                }

            } else {
                result = false;
            }
            if (result == false)
                break;
        }
        return result;
    }
}
