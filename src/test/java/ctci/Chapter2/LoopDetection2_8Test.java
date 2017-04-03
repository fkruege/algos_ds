package ctci.Chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/1/17.
 */
public class LoopDetection2_8Test {

    LoopDetection2_8 loop = new LoopDetection2_8();
    LoopDetection2_8Runners loopRunner = new LoopDetection2_8Runners();

    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    @Before
    public void before() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

    }

    @Test
    public void detectLoop1() throws Exception {
        Node node = loop.detectLoop(n1);
        Node runner = loopRunner.detectLoop(n1);
        assertSame(n2, node);
        assertSame(n2, runner);
    }


    @Test
    public void detectLoop2() throws Exception {
        n4.next = n5;
        Node node = loop.detectLoop(n1);
        Node runner = loopRunner.detectLoop(n1);
        assertNull(node);
        assertNull(runner);
    }

}