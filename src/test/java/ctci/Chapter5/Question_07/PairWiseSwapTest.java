package ctci.Chapter5.Question_07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/9/17.
 */
public class PairWiseSwapTest {

    PairWiseSwap swap;

    @Before
    public void setUp() throws Exception {
        swap = new PairWiseSwap();
    }

    @Test
    public void swapEvenOdds() throws Exception {
        assertEquals(9, swap.swapEvenOdds(6));

        assertEquals(ReferenceA.swapOddEvenBits(234321), swap.swapEvenOdds(234321));


    }

}