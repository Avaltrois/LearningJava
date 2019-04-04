package ua.learningjava.loop;

/**
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */
public class Factorial {

    /**
     * calculate Factorial.
     *
     * @return factorial.
     */
    public int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
