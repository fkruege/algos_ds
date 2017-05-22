package ctci.Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/6/17.
 */
public class AbsoluteValueTest {
    AbsoluteValue abs;

    @Before
    public void setUp() throws Exception {
        abs = new AbsoluteValue();
    }

    @Test
    public void getAbs() throws Exception {
        assertEquals(7, abs.getAbs(7));
        assertEquals(7, abs.getAbs(-7));
    }

}