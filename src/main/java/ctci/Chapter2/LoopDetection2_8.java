package ctci.Chapter2;

import java.util.HashSet;

/**
 * Created by fkruege on 4/1/17.
 */
public class LoopDetection2_8 {

    public Node detectLoop(Node node) {

        HashSet<Node> nodeSet = new HashSet<Node>();

        while (node != null) {

            if (nodeSet.contains(node)) {
                return node;
            } else {
                nodeSet.add(node);
            }
            node = node.next;
        }

        return null;


    }


}
