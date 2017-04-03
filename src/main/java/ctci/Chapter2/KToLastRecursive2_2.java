package ctci.Chapter2;

import javafx.util.Pair;

/**
 * Created by fkruege on 3/30/17.
 */
public class KToLastRecursive2_2 {

    public Node getKthToLast(Node node, int pos) {
        getElement(node, pos);
        return _node;
    }

    private Node _node;

    private int getElement(Node node, int kthFromLst) {

        if (node == null) {
            return 0;
        }

        int pos = getElement(node.next, kthFromLst) + 1;

        if (pos-1 == kthFromLst) {
            _node = node;
        }

        return pos;
    }
}
