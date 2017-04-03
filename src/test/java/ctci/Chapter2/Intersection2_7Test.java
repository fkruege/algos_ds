package ctci.Chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/1/17.
 */
public class Intersection2_7Test {

    Intersection2_7 intersect = new Intersection2_7();

    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    Node m6 = new Node(6);
    Node m7 = new Node(7);
    Node m8 = new Node(8);
    Node m9 = new Node(9);


    @Before
    public void before() throws Exception {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        m6.next = m7;
        m7.next = m8;
        m8.next = m9;
        m9.next = n3;
    }

    @Test
    public void findIntersection1() throws Exception {
        Node intersection = intersect.findIntersection(n1, m6);
        assertSame(n3, intersection);
    }


    @Test
    public void findIntersection2() throws Exception {
        m9.next = null;
        Node intersection = intersect.findIntersection(n1, m6);
        assertNull( intersection);
    }


    @Test
    public void findIntersection3() throws Exception {
        Node intersection = intersect.findIntersection(n1, n1);
        assertSame(n1, intersection);
    }


}