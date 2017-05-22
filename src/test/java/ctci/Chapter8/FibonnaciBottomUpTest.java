package ctci.Chapter8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/16/17.
 */
public class FibonnaciBottomUpTest {

    FibonnaciBottomUp fibonnaci;

    @Before
    public void setUp() throws Exception {
        fibonnaci = new FibonnaciBottomUp();
    }

    @Test
    public void calculate() throws Exception {
        assertEquals(0, fibonnaci.calculate(0));
        assertEquals(1, fibonnaci.calculate(1));
        assertEquals(1, fibonnaci.calculate(2));
        assertEquals(2, fibonnaci.calculate(3));
        assertEquals(3, fibonnaci.calculate(4));
        assertEquals(5, fibonnaci.calculate(5));
        assertEquals(8, fibonnaci.calculate(6));
        assertEquals(13, fibonnaci.calculate(7));
        assertEquals(21, fibonnaci.calculate(8));
    }

}