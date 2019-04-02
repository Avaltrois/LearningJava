package ua.learningjava.max;
/**
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Maximum of 3 numbers
     * @return max
     */
    public int max(int first, int second){
        return first>second ? first : second;
    }

    public int max(int first, int second, int third) {
        int temp= this.max(first, second);
        int temp1=this.max(temp,third);

    return temp1;

}}
