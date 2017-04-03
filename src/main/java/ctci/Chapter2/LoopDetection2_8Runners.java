package ctci.Chapter2;

import java.util.HashSet;

/**
 * Created by fkruege on 4/1/17.
 */
public class LoopDetection2_8Runners {

    public Node detectLoop(Node node) {

        Node fast = node;
        Node slow = node;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = node;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }


}
