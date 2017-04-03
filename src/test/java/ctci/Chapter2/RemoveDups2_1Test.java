package ctci.Chapter2;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 3/30/17.
 */
public class RemoveDups2_1Test {


    @Test
    public void removeDuplicates() throws Exception {


        Node n1 = new Node(1);
        Node n2a = new Node(2);
        Node n2b = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2a;
        n2a.next = n2b;
        n2b.next = n3;

        RemoveDups2_1 remove = new RemoveDups2_1();
        remove.removeDuplicates(n1);

        Node current = n1;
        int sum = 0;
        while(current != null){
           sum+= current.value;
           current = current.next;
        }
        assertEquals(6, sum);
    }


    @Test
    public void removeDuplicates2() throws Exception {

        Node n1a = new Node(1);
        Node n1b = new Node(1);
        Node n1c = new Node(1);

        n1a.next = n1b;
        n1b.next = n1c;

        RemoveDups2_1 remove = new RemoveDups2_1();
        remove.removeDuplicates(n1a);

        Node current = n1a;
        int sum = 0;
        while(current != null){
            sum+= current.value;
            current = current.next;
        }
        assertEquals(1, sum);
    }


}