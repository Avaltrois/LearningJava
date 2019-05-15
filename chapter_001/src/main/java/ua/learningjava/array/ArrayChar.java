package ua.learningjava.array;

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Checks that the word starts with the prefix.
     *
     * @param prefix prefix.
     * @return if the word starts with a prefix.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (data[i] != value[i]) {
                result = false;

            }
        }
        return result;

    }
}
