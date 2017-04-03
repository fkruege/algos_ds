package ctci.Chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/2/17.
 */
public class SortStack3_5Test {


    @Test
    public void push() throws Exception {

        SortStack3_5 stack = new SortStack3_5();

        stack.push(1);
        stack.push(5);
        stack.push(9);
        stack.push(2);
        stack.push(3);
        stack.push(0);

        assertEquals(0, (int)stack.pop());
        assertEquals(1, (int)stack.pop());
        assertEquals(2, (int)stack.pop());
        assertEquals(3, (int)stack.pop());
        assertEquals(5, (int)stack.pop());
        assertEquals(9, (int)stack.pop());


    }

}