package ctci.Chapter2;

import com.sun.tools.javac.util.Pair;

/**
 * Created by fkruege on 4/1/17.
 */
public class Intersection2_7 {

    public Node findIntersection(Node n1, Node n2) {

        Pair<Node, Integer> n1Last_Length = findLastAndGetLength(n1);
        Pair<Node, Integer> n2Last_Length = findLastAndGetLength(n2);


        Node node1 = n1Last_Length.fst;
        Node node2 = n2Last_Length.fst;

        if (node1 != node2) {
            return null;
        }

        int length1 = n1Last_Length.snd;
        int length2 = n2Last_Length.snd;

        int difference = Math.abs(length1 - length2);

        if (length1 <= length2) {
            return getIntersection(n1, difference);
        } else {
            return getIntersection(n2, difference);
        }


    }

    private Node getIntersection(Node node, int count) {
        for (int i = 0; i < count; i++) {
            node = node.next;
        }
        return node;
    }


    private Pair<Node, Integer> findLastAndGetLength(Node n1) {
        if (n1 == null) {
            return new Pair<Node, Integer>(null, 0);
        }

        int count = 1;
        while (n1.next != null) {
            count++;
            n1 = n1.next;
        }

        return new Pair<Node, Integer>(n1, count);
    }


}


