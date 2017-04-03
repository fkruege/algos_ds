package ctci.Chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 3/30/17.
 */
public class KToLastIter2_2Test {
    @Test
    public void getKthToLast() throws Exception {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        KToLastIter2_2 kto = new KToLastIter2_2();

        assertEquals(5, kto.getKthToLast(n1, 0).value);
        assertEquals(4, kto.getKthToLast(n1, 1).value);
        assertEquals(3, kto.getKthToLast(n1, 2).value);
        assertEquals(2, kto.getKthToLast(n1, 3).value);
        assertEquals(1, kto.getKthToLast(n1, 4).value);

        KToLastRecursive2_2 recurs = new KToLastRecursive2_2();


        assertEquals(5, recurs.getKthToLast(n1, 0).value);
        assertEquals(4, recurs.getKthToLast(n1, 1).value);
        assertEquals(3, recurs.getKthToLast(n1, 2).value);
        assertEquals(2, recurs.getKthToLast(n1, 3).value);
        assertEquals(1, recurs.getKthToLast(n1, 4).value);
    }

}