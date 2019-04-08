package ua.learningjava.loop;

public class psvmPaint {
    public static void main(String[] args) {
        int h = 4;
        int w = 2 * h - 1;
        for (int i = 0; i != h; i++) {
            for (int j = 0; j != w; j++) {
                if (i >= h - j - 1 && i + h - 1 >= j) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}