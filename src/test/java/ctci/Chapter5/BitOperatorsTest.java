package ctci.Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/6/17.
 */
public class BitOperatorsTest {


    BitOperators bit;

    @Before
    public void setUp() throws Exception {
        bit = new BitOperators();
    }

    @Test
    public void clearBit() throws Exception {
    }

    @Test
    public void setBit() throws Exception {
    }

    @Test
    public void getBit() throws Exception {
        int seven = 7;
        assertEquals(1, bit.getBit(seven, 0));
        assertEquals(1, bit.getBit(seven, 1));
        assertEquals(1, bit.getBit(seven, 2));
        assertEquals(0, bit.getBit(seven, 3));

        int negSeven = -7;
        assertEquals(1, bit.getBit(negSeven, 0));
        assertEquals(0, bit.getBit(negSeven, 1));
        assertEquals(0, bit.getBit(negSeven, 2));
        assertEquals(1, bit.getBit(negSeven, 3));

    }


    @Test
    public void getBitBool() throws Exception {
        int seven = 7;
        assertEquals(true, bit.getBitBool(seven, 0));
        assertEquals(true, bit.getBitBool(seven, 1));
        assertEquals(true, bit.getBitBool(seven, 2));
        assertEquals(false, bit.getBitBool(seven, 3));

        int negSeven = -7;
        assertEquals(true, bit.getBitBool(negSeven, 0));
        assertEquals(false, bit.getBitBool(negSeven, 1));
        assertEquals(false, bit.getBitBool(negSeven, 2));
        assertEquals(true, bit.getBitBool(negSeven, 3));

    }

    @Test
    public void count1Bits() throws Exception {
        assertEquals(0, bit.count1Bits(0));
        assertEquals(1, bit.count1Bits(1));
        assertEquals(32, bit.count1Bits(-1));
        assertEquals(3, bit.count1Bits(7));
    }

}