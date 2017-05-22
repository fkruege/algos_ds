package ctci.Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Insertion5_1Test {

    Insertion5_1 insertion;
    Insertion5_1_Reference reference;


    @Before
    public void setUp() throws Exception {
        insertion = new Insertion5_1();
        reference = new Insertion5_1_Reference();
    }

    @Test
    public void insert_m_into_n() throws Exception {
        int m = 0x0003;
        int n = 0x0007;
        assertEquals(31, insertion.insert_m_into_n(m, n, 3, 4));

        int referenceAnswer = reference.updateBits(103217, 13, 4, 12);
        int myAnswer = insertion.insert_m_into_n(13, 103217, 4, 12);
        assertEquals(referenceAnswer, myAnswer);


    }

    @Test
    public void getBitAt() throws Exception {
        int num = 0x0006;
        assertEquals(6, num);
        assertEquals(0, insertion.getBitAt(num, 0));
        assertEquals(1, insertion.getBitAt(num, 1));
        assertEquals(1, insertion.getBitAt(num, 2));
        assertEquals(0, insertion.getBitAt(num, 3));
    }

    @Test
    public void setBitAt() throws Exception {
        int num = 0x0006;
        assertEquals(6, insertion.setBitAt(num, 2, 1));
        assertEquals(2, insertion.setBitAt(num, 2, 0));
        assertEquals(4, insertion.setBitAt(num, 1, 0));
        assertEquals(7, insertion.setBitAt(num, 0, 1));
    }

    @Test
    public void test(){
        System.out.println(1 << 0);
        System.out.println(1 << 1);
        System.out.println(1 << 2);
        System.out.println((1 << 2) - 1);

    }

}