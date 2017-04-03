package ctci.Chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/1/17.
 */
public class SumLists2_5Test {

    SumLists2_5 sumLists = new SumLists2_5();

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
    public void sumLists() throws Exception {

        int value = sumLists.sumLists(n1, z1);
        assertEquals(1295, value);


    }

}