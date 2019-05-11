package ua.learningjava.array;

/**
 * Square from bound.
 *
 * @author Avaltrois
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }
}
