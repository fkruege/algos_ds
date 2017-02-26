package leetcode.FindFirstUniqueChar;

import org.junit.Assert;

/**
 * Created by fkruege on 2/17/2017.
 */
public class UniqueCharTester {

    public void test(IFindFirstUniqueChar findUnique) {

        String input1 = "razorback";
        char expectedChar1 = 'z';
        char actual = findUnique.find(input1);
        Assert.assertEquals(expectedChar1, actual);
        System.out.println(expectedChar1 + " is the first unique character in " + input1);

        String input2 = "abacus";
        char expectedChar2 = 'b';
        char actual2 = findUnique.find(input2);
        Assert.assertEquals(expectedChar2, actual2);
        System.out.println(expectedChar2 + " is the first unique character in " + input2);

        String input3 = "llama";
        char expectedChar3 = 'm';
        char actual3 = findUnique.find(input3);
        Assert.assertEquals(expectedChar3, actual3);
        System.out.println(expectedChar3 + " is the first unique character in " + input3);

        String input4 = "aabbcc";
        char expectedChar4 = Character.MIN_VALUE;
        char actual4 = findUnique.find(input4);
        Assert.assertEquals(expectedChar4, actual4);
        System.out.println(expectedChar4 + " is the first unique character in " + input4);

        String input5 = "";
        char expectedChar5 = Character.MIN_VALUE;
        char actual5 = findUnique.find(input4);
        Assert.assertEquals(expectedChar5, actual5);
        System.out.println(expectedChar5 + " is the first unique character in " + input5);

        String input6 = "aabbccddeeffz";
        char expectedChar6 = 'z';
        char actual6 = findUnique.find(input6);
        Assert.assertEquals(expectedChar6, actual6);
        System.out.println(expectedChar6 + " is the first unique character in " + input6);


    }


}
