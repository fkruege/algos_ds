package ctci.Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/7/17.
 */
public class FlipBit5_3Test {
    FlipBit5_3 flipBits;

    @Before
    public void setUp() throws Exception {
        flipBits = new FlipBit5_3();
    }

    @Test
    public void findLongest1Sequence() throws Exception {
        assertEquals(8, flipBits.findLongest1Sequence(1775));
        assertEquals(32, flipBits.findLongest1Sequence(-1));
        assertEquals(3, flipBits.findLongest1Sequence(3074));
        assertEquals(-1, flipBits.findLongest1Sequence(0));
    }

    @Test
    public void findLongestSequence2(){
        int[][] cases = {{-1, 32}, {Integer.MAX_VALUE, 32}, {-10, 31}, {0, 1},
                {1, 2}, {15, 5}, {1775, 8}};
        for (int[] c : cases) {
            int x = flipBits.findLongest1Sequence(c[0]);
            boolean r = (c[1] == x);
            System.out.println(c[0] + ": " + x + ", " + c[1] + " " + r);
        }
    }

}