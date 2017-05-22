package ctci.Chapter5.Question_07;

/**
 * Created by fkruege on 5/9/17.
 */
public class ReferenceA {

    public static int swapOddEvenBits(int x) {
        return ( ((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) << 1) );
    }

}
