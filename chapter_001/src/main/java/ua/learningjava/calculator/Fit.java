package ua.learningjava.calculator;


/**
 *The program for calculating the ideal weight.
 */
public class Fit {

    /**
     * The ideal weight for men.
     * @param height height.
     * @return ideal weight.
     */
    public double manWeight(double height) {
        return (height -100) * 1.15;
    }

    /**
     * Perfect weight for a woman.
     * @param height height.
     * @return ideal weight.
     */
    public double womanWeight(double height) {
        return (height -110) * 1.15;
    }
}
