package ua.learningjava.converter;

/**
 * Currency converter.
 */
public class Converter {

    /**
     * Convert rubles to euros.
     * @param value rubles.
     * @return euros.
     */
    public int rublesToEuros(int value) {
        return value/70;
    }

    /**
     * Convert rubles to dollars.
     * @param value rubles.
     * @return dollars.
     */
    public int rublesToDollars(int value) {
        return value/60;
    }
    /**
     * Convert euros to rubles.
     * @param value euros.
     * @return rubles.
     */
    public int EurosTorubles(int value) {
        return value*70;
    }

    /**
     * Convert dollars to rubles.
     * @param value dollars.
     * @return rubles.
     */
    public int DollarsTorubles(int value) {
        return value*60;
    }
}
