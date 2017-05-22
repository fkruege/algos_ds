package ctci.Chapter5;

import ctci.Chapter5.Question_04.NextNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/7/17.
 */
public class NextNumberTest {
    NextNumber next;

    @Before
    public void setUp() throws Exception {
        next = new NextNumber();
    }

    @Test
    public void getNextHighestLowest() throws Exception {
        NextNumber.NextHighestLowest nextHighestLowest = next.getNextHighestLowest(8);
        assertEquals(16, nextHighestLowest.highest.intValue());
        assertEquals(4, nextHighestLowest.lowest.intValue());

    }


    @Test
    public void getNextHighestLowest1() throws Exception {
        NextNumber.NextHighestLowest nextHighestLowest = next.getNextHighestLowest(3);
        assertEquals(5, nextHighestLowest.highest.intValue());
//        assertEquals(4, nextHighestLowest.lowest.intValue());
    }

    @Test
    public void simpleTest() throws Exception {
        int num = -1;
        int shiftCount = 1;
        for(int i = 0; i <= 32; i ++){
            num = num >> 1;
            System.out.println("Shift count: " + (i +1) +  " --> " + num );
        }
    }


}