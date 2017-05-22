package BST;

import com.sun.tools.javac.util.Pair;
import edu.princeton.cs.algs4.Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 4/30/17.
 */
public class MyBinaryTree {

    MyBST.Node<Integer, Integer> root;


    public MyBST.Node<Integer, Integer> getRoot() {
        return root;
    }


    public void add(Integer[] input) {
        for (Integer i : input) {
            put(root, i, i);
        }
    }

    public void add(Integer key, Integer value) {
        put(root, key, value);
    }


    private void put(MyBST.Node<Integer, Integer> node,
                     Integer key,
                     Integer value) {

        if (root == null) {
            root = new MyBST.Node<Integer, Integer>(null, null);
        }


        Queue<MyBST.Node<Integer, Integer>> queue = new Queue<MyBST.Node<Integer, Integer>>();

        queue.enqueue(root);

        while (!queue.isEmpty()) {
            MyBST.Node<Integer, Integer> dequeue = queue.dequeue();
            if (dequeue.key == null) {
                dequeue.key = key;
                dequeue.value = value;
                return;
            }

            if (dequeue.left == null) {
                dequeue.left = new MyBST.Node<Integer, Integer>(null, null);
            }

            if (dequeue.right == null) {
                dequeue.right = new MyBST.Node<Integer, Integer>(null, null);
            }

            queue.enqueue(dequeue.left);
            queue.enqueue(dequeue.right);
        }

    }


    public List<List<Integer>> getDepthList() {

        List<List<Integer>> depthList = new ArrayList<List<Integer>>();
        Queue<Pair<Integer, MyBST.Node<Integer, Integer>>> queue = new Queue<Pair<Integer, MyBST.Node<Integer, Integer>>>();

        MyBST.Node<Integer, Integer> root = (MyBST.Node<Integer, Integer>) getRoot();
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


}
