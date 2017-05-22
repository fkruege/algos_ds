package ctci.Chapter6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/12/17.
 */
public class PrimeCheckerTest {

    PrimeChecker primeChecker;


    @Before
    public void setUp() throws Exception {
        primeChecker = new PrimeChecker();
    }

    @Test
    public void isPrimeNumber() throws Exception {
        assertFalse(primeChecker.isPrimeNumber(1));
        assertTrue(primeChecker.isPrimeNumber(2));
        assertTrue(primeChecker.isPrimeNumber(3));
        assertFalse(primeChecker.isPrimeNumber(4));
    }

    @Test
    public void isPrimeNumberRootCheck() throws Exception {
        assertFalse(primeChecker.isPrimeNumberRootCheck(1));
        assertTrue(primeChecker.isPrimeNumberRootCheck(2));
        assertTrue(primeChecker.isPrimeNumberRootCheck(3));
        assertFalse(primeChecker.isPrimeNumberRootCheck(4));
        assertFalse(primeChecker.isPrimeNumberRootCheck(102));
        assertTrue(primeChecker.isPrimeNumberRootCheck(109));
    }

}