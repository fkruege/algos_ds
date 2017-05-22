package ctci.Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fkruege on 5/7/17.
 */
public class FlipBit5_3bTest {

    FlipBit5_3b flipBits;

    @Before
    public void setUp() throws Exception {

        flipBits = new FlipBit5_3b();
    }


    @Test
    public void findLongestSequence1() throws Exception {
//        assertEquals(8, flipBits.findLongestSequence(1775));
//        assertEquals(2, flipBits.findLongestSequence(4));
//        assertEquals(2, flipBits.findLongestSequence(1));
        assertEquals(3, flipBits.findLongestSequence(5));

    }


    @Test
    public void findLongestSequence() throws Exception {

        int[][] cases = {{-1, 32}, {Integer.MAX_VALUE, 32}, {-10, 31}, {0, 1},
                {1, 2}, {15, 5}, {1775, 8}};
        for (int[] c : cases) {
            int x = flipBits.findLongestSequence(c[0]);
            boolean r = (c[1] == x);
            System.out.println(c[0] + ": " + x + ", " + c[1] + " " + r);
            assertEquals(c[1], x);
        }
    }

}