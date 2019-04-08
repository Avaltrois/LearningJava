package ua.learningjava.loop;

/**
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    public String RightPartOfTriangle(int height) {
        //Buffer for the result.
        StringBuilder screen = new StringBuilder();
        //width will be equal to height.
        int width = height;
        //the outer loop moves in rows.
        for (int row = 0; row != height; row++) {
            //the inner loop determines the position of the cell in the row.
            for (int colomn = 0; colomn != width; colomn++) {
                // if the string is equal to the cell, then draw ^.
                // in this case, the line determines how much ^ will be on the line
                if (row >= colomn) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // add line breaks.
            screen.append(System.lineSeparator());
        }
        // Get the result.
        return screen.toString();
    }

    public String LeftPartOfTriangle(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int colomn = 0; colomn != width; colomn++) {
                if (row >= width - colomn - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }


}
