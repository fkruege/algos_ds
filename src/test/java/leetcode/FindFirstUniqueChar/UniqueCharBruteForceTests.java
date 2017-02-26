package leetcode.FindFirstUniqueChar;

import org.junit.Test;

/**
 * Created by fkruege on 2/17/2017.
 */
public class UniqueCharBruteForceTests {

    @Test
    public void test_find(){
        UniqueCharBruteForce findUniqueChar = new UniqueCharBruteForce();
        UniqueCharTester tester = new UniqueCharTester();
        tester.test(findUniqueChar);

    }
}
