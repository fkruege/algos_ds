package interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 6/26/17.
 */
public class SimpleReversalTest {


    @Test
    public void reverse() throws Exception {

        String input = "the cat is black";
        String expected = "kcalb si tac eht";

        char[] reverse = SimpleReversal.reverse(input.toCharArray());
        assertEquals(expected, new String(reverse));
    }


    @Test
    public void reverse2() throws Exception {
        String input = "the";
        String expected = "eht";

        char[] reverse = SimpleReversal.reverse(input.toCharArray());
        assertEquals(expected, new String(reverse));
    }



    @Test
    public void reverse3() throws Exception {
        String input = "tell";
        String expected = "llet";

        char[] reverse = SimpleReversal.reverse(input.toCharArray());
        assertEquals(expected, new String(reverse));
    }

    @Test
    public void reverseWords(){
        String input = "the cat is black";
        String expected = "eht tac si kcalb";

        char[] reverse = SimpleReversal.reverseWords(input.toCharArray());
        assertEquals(expected, new String(reverse));
    }

}