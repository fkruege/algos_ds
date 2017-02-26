package leetcode.FindFirstUniqueChar;

import org.junit.Test;

/**
 * Created by fkruege on 2/17/2017.
 */
public class HashTableUniqueCharTests {

    @Test
    public void test_find(){
        HashTableUniqueChar findUniqueChar = new HashTableUniqueChar();
        UniqueCharTester tester = new UniqueCharTester();
        tester.test(findUniqueChar);
    }
}
