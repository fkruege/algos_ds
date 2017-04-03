package ctci.Chapter2;

/**
 * Created by fkruege on 4/1/17.
 */
public class SumLists2_5v2 {

    public Node sumLists(Node n1, Node n2) {
        return addList(n1, n2, 0);
    }

    private Node addList(Node n1, Node n2, int carry) {

        if (n1 == null && n2 == null) {
            if (carry > 0) {
                return new Node(carry);
            } else {
                return null;
            }
        }

        int sum = 0;

        sum += carry;
        if (n1 != null) {
            sum += n1.value;
        }
        if (n2 != null) {
            sum += n2.value;
        }

        int onesPlace = sum % 10;
        int carryOver = sum / 10;

        Node node = new Node(onesPlace);
        Node n1Next = n1 == null ? null : n1.next;
        Node n2Next = n2 == null ? null : n2.next;

        node.next = addList(n1Next, n2Next, carryOver);

        return node;
    }

}
