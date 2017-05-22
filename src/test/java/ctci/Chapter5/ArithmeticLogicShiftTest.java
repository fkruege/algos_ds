package ctci.Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/5/17.
 */
public class ArithmeticLogicShiftTest {

    ArithmeticLogicShift shift;

    @Before
    public void before() {
        shift = new ArithmeticLogicShift();
    }

    @Test
    public void repeatedArithmeticShift() throws Exception {

        int number = 255;
        int shiftAmt = 2;
        int arithmeticShift = shift.repeatedArithmeticShift(number, shiftAmt);
        int logicalShift = shift.repeatedLogicalShift(number, shiftAmt);

        System.out.println("arithmetic shift: " + arithmeticShift);
        System.out.println("logical shift: " + logicalShift);
    }

    @Test
    public void simpleBitTesting(){
        int zero = 0;
        int one = 1;
        int fifteen = 15;
        assertEquals(0x0000, zero);
        assertEquals(0x0001, one);
        assertEquals(0x000F, fifteen);


    }



}