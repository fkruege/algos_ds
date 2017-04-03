package ctci.Chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/1/17.
 */
public class Partition2_4Test {

    Partition2_4 partition2_4 = new Partition2_4();

    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n5a = new Node(5);
    Node n5b = new Node(5);
    Node n8 = new Node(8);
    Node n10 = new Node(10);

    @Before
    public void before() {
        n3.next = n5a;
        n5a.next = n8;
        n8.next = n5b;
        n5b.next = n10;
        n10.next = n2;
        n2.next = n1;
    }

    @Test
    public void partition() throws Exception {
        Node partition = partition2_4.partition(n3, 5);
        assertNotNull(partition);
    }

}