package leetcode.FindFirstUniqueChar;

import org.junit.Test;

/**
 * Created by fkruege on 2/17/2017.
 */
public class FindUniqueNTimeTests {

    @Test
    public void test_find(){
        FindUniqueNTime findUniqueChar = new FindUniqueNTime();
        UniqueCharTester tester = new UniqueCharTester();
        tester.test(findUniqueChar);
    }
}
