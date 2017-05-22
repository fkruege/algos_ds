package ctci.Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/6/17.
 */
public class IntToBinaryTest {
    IntToBinary converter;
    @Before
    public void setUp() throws Exception {
        converter = new IntToBinary();
    }

    @Test
    public void convertToBinary() throws Exception {
        boolean[] bits = converter.convertToBinary(7);
        assertTrue(bits[0]);
        assertTrue(bits[1]);
        assertTrue(bits[2]);
        assertFalse(bits[3]);
    }


    @Test
    public void convertToBinary_8() throws Exception {
        boolean[] bits = converter.convertToBinary(8);
        assertFalse(bits[0]);
        assertFalse(bits[1]);
        assertFalse(bits[2]);
        assertTrue(bits[3]);
    }


}