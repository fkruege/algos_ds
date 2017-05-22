package ctci.Chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/12/17.
 */
public class PrimeFinderTest {

    PrimeFinder primeFinder;

    @Before
    public void setUp() throws Exception {
        primeFinder = new PrimeFinder();
    }

    @Test
    public void getPrimesUpTo_10() throws Exception {
        List<Integer> primes = primeFinder.getPrimesUpTo(10);
        assertEquals(4, primes.size());
        assertTrue(primes.contains(2));
        assertTrue(primes.contains(3));
        assertTrue(primes.contains(5));
        assertTrue(primes.contains(7));
    }


    @Test
    public void getPrimesUpTo_1000() throws Exception {
        List<Integer> primes = primeFinder.getPrimesUpTo(1000);
        assertEquals(4, primes.size());
    }

}