package ctci.Chapter2;

import java.util.HashMap;

/**
 * Created by fkruege on 3/30/17.
 */
public class RemoveDups2_1 {

    public void removeDuplicates(Node head) {

        HashMap<Integer, Boolean> valueMap = new HashMap<Integer, Boolean>();

        Node current = head;
        Node previous = null;

        while (current != null) {
            int value = current.value;
            if (valueMap.containsKey(value)) {
                previous.next = current.next;
                current = current.next;

            } else {
                valueMap.put(value, true);
                previous = current;
                current = current.next;
            }

        }

    }
}
