package ua.learningjava.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method of calculating the perimeter of the lengths of the sides.
     * <p>
     * Formula.
     * <p>
     * (ab + ac + bc) / 2
     *
     * @param ab distance between points a & b
     * @param ac distance between points a & c
     * @param bc distance between points b & c
     * @return Perimeter.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }


    /**
     * Method calculates the area of the triangle.
     *
     * @return Return the area if the triangle exists or -1 if there is no triangle.
     */
    public double area() {
        double rsl = -1; // set the value to -1, since it may be that there is no triangle.
        // This value suggests. that there is no triangle.
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }

    /**
     * The method checks whether it is possible to construct a triangle with such lengths of the sides.
     *
     * @param ab The length from point a to b.
     * @param ac The length from point a to с.
     * @param bc The length from point b to c.
     * @return
     */
    private boolean exist(double ab, double ac, double bc) {
        boolean r1 = false;
        if ((ab < ac + bc) && (ac < bc + ab) && (bc < ac + ab)) {
            r1 = true;
        }
        return r1;
    }
}
