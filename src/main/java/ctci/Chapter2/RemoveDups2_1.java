package ctci.Chapter2;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by fkruege on 3/30/17.
 */
public class RemoveDups2_1 {

    public void removeDuplicates(Node head) {

        HashSet<Integer> valueMap = new HashSet<Integer>();

        Node current = head;
        Node previous = null;

        while (current != null) {
            int value = current.value;
            if (valueMap.contains(value)) {
                previous.next = current.next;
                current = current.next;

            } else {
                valueMap.add(value);
                previous = current;
                current = current.next;
            }

        }

    }
}
