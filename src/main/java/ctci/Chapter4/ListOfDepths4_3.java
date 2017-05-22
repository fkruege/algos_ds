package ctci.Chapter4;


import BST.MyBST;
import com.sun.tools.javac.util.Pair;
import edu.princeton.cs.algs4.Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 4/15/17.
 */
public class ListOfDepths4_3 {

    List<List<Integer>> depthList = new ArrayList<List<Integer>>();

    public ListOfDepths4_3() {

    }

    public List<List<Integer>> getDepthList() {
        return depthList;
    }

    public void createDepthList(MyBST<Integer, Integer> bst) {

        Queue<Pair<Integer, MyBST.Node<Integer, Integer>>> queue = new Queue<Pair<Integer, MyBST.Node<Integer, Integer>>>();

        MyBST.Node<Integer, Integer> root = bst.getRoot();
        queue.enqueue(new Pair<Integer, MyBST.Node<Integer, Integer>>(0, root));

        while (!queue.isEmpty()) {
            Pair<Integer, MyBST.Node<Integer, Integer>> dequeue = queue.dequeue();

            if(dequeue.snd == null){
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


    }


}
