package ctci.Chapter2;

/**
 * Created by fkruege on 3/30/17.
 */
public class KToLastIter2_2 {

    public Node getKthToLast(Node node, int pos) {

        Node current = node;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        current = node;
        int skipOver = size - pos;
        for(int i = 1; i < skipOver; i++){
            current = current.next;
        }
        return current;
    }
}
