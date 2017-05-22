package BST;

import com.sun.tools.javac.util.Pair;
import edu.princeton.cs.algs4.Queue;

import java.util.ArrayList;
import java.util.List;

public class MyBST<Key extends Comparable<Key>, Value> {

    Node<Key, Value> root;

    public MyBST() {
    }

    public Node<Key, Value> getRoot() {
        return root;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    public Node<Key, Value> find(Key key) {
        return find(root, key);
    }


    private Node<Key, Value> find(Node<Key, Value> node, Key key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node;
        } else if (cmp < 0) {
            return find(node.left, key);
        } else {
            return find(node.right, key);
        }

    }


    private Node put(Node<Key, Value> x, Key key, Value value) {
        if (x == null) {
            return new Node<Key, Value>(key, value);
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else {
            x.value = value;
        }

        return x;
    }


    public List<List<Integer>> getDepthList() {

        List<List<Integer>> depthList = new ArrayList<List<Integer>>();
        Queue<Pair<Integer, Node<Integer, Integer>>> queue = new Queue<Pair<Integer, MyBST.Node<Integer, Integer>>>();

        MyBST.Node<Integer, Integer> root = (Node<Integer, Integer>) getRoot();
        queue.enqueue(new Pair<Integer, MyBST.Node<Integer, Integer>>(0, root));

        while (!queue.isEmpty()) {
            Pair<Integer, MyBST.Node<Integer, Integer>> dequeue = queue.dequeue();

            if (dequeue.snd == null) {
                continue;
            }

            List<Integer> integers;

            if (depthList.size() > dequeue.fst) {
                integers = depthList.get(dequeue.fst);
            } else {
                integers = new ArrayList<Integer>();
                depthList.add(integers);
            }

            integers.add(dequeue.snd.value);

            queue.enqueue(new Pair<Integer, MyBST.Node<Integer, Integer>>(dequeue.fst + 1, dequeue.snd.left));
            queue.enqueue(new Pair<Integer, MyBST.Node<Integer, Integer>>(dequeue.fst + 1, dequeue.snd.right));
        }

        return depthList;

    }


    public static class Node<Key, Value> {
        public Key key;
        public Value value;
        public Node<Key, Value> left;
        public Node<Key, Value> right;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;

        }
    }
}
