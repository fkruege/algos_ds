package ctci.Chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/2/17.
 */
public class MyStackTest {
    @Test
    public void push() throws Exception {

        MyStack<Integer> stack = new MyStack<Integer>();
        assertTrue(stack.isEmpty());

        stack.push(0);
        assertFalse(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        assertEquals(4,(int) stack.peek());
        assertEquals(4,(int) stack.pop());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());

    }

}