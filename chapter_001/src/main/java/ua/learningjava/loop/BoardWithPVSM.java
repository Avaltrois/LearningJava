package ua.learningjava.loop;

public class BoardWithPVSM {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (((i + j) % 2) == 0) { // condition of checking what to write space or X
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}