package ctci.Chapter8.Question5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/25/17.
 */
public class RecursiveMultiplyTest {

    RecursiveMultiply mult;

    @Before
    public void setUp() throws Exception {
        mult = new RecursiveMultiply();
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(12, mult.multiply(3, 4));
    }

}