package ctci.Chapter5.Question_06;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/9/17.
 */
public class ConversionTest {
    Conversion conversion;

    @Before
    public void setUp() throws Exception {
        conversion = new Conversion();
    }

    @Test
    public void flipBits() throws Exception {
        assertEquals(2, conversion.flipBits(29, 15));

        int a = -23432;
        int b = 512132;

        int referenceSolution = ReferenceA.bitSwapRequired(a, b);
        assertEquals(referenceSolution, conversion.flipBits(a, b));
    }

}