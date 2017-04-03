package ctci.Chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/1/17.
 */
public class SumLists2_5v2Test {

    SumLists2_5v2 sumLists = new SumLists2_5v2();

    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);

    Node z1 = new Node(4);
    Node z2 = new Node(7);
    Node z3 = new Node(9);


    @Before
    public void before() {
        n1.next = n2;
        n2.next = n3;

        z1.next = z2;
        z2.next = z3;
    }

    @Test
    public void sumLists1() throws Exception {
        Node node = sumLists.sumLists(n1, z1);
        verifySum(node, 1295);
    }


    @Test
    public void sumLists2() throws Exception {
        Node node = sumLists.sumLists(n1, z3);
        verifySum(node, 330);
    }

    private void verifySum(Node node, int expected){

        StringBuilder sb = new StringBuilder();
        while(node != null){
            sb.insert(0, node.value);
            node = node.next;
        }

        int value = Integer.parseInt(sb.toString());
        assertEquals(expected, value);

    }

}