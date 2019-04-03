package ua.learningjava.loop;
/**
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * Sum of even numbers in a row from start too finish
     * @return sum
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if ((i % 2) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}