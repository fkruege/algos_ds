package ctci.Chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 3/31/17.
 */
public class DeleteMiddle2_3Test {

    private DeleteMiddle2_3 deleteMiddle;

    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    @Before
    public void before() {
        deleteMiddle = new DeleteMiddle2_3();

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
    }

    @Test
    public void deleteMiddle1() throws Exception {
        deleteMiddle.deleteMiddle(n1);
        verify(n1, 12);
    }

    @Test
    public void deleteMiddle2() throws Exception {
        n2.next = null;

        deleteMiddle.deleteMiddle(n1);
        verify(n1, 3);
    }

    @Test
    public void deleteMiddle3() throws Exception {
        n3.next = null;

        deleteMiddle.deleteMiddle(n1);
        verify(n1, 4);
    }

    private void verify(Node node, int expected) {
        Node current = node;
        int sum = 0;
        while (current != null) {
            sum += current.value;
            current = current.next;
        }
        assertEquals(expected, sum);
    }

}