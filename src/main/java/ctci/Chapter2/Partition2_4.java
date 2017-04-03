package ctci.Chapter2;

/**
 * Created by fkruege on 4/1/17.
 */
public class Partition2_4 {

    public Node partition(Node node, int x) {
        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;
            if (node.value < x) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }


}
