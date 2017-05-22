package BST;

import edu.princeton.cs.algs4.Queue;

/**
 * Created by fkruege on 5/3/17.
 */
public class InvertBinaryTreeIterative implements InvertTree {

    public void invertTree(MyBinaryTree binaryTree) {

        MyBST.Node<Integer, Integer> root = binaryTree.getRoot();
        Queue<MyBST.Node<Integer, Integer>> queue = new Queue<MyBST.Node<Integer, Integer>>();

        queue.enqueue(root);

        while (!queue.isEmpty()) {
            MyBST.Node<Integer, Integer> dequeue = queue.dequeue();
            if(dequeue == null){
                continue;
            }

            MyBST.Node<Integer, Integer> left = dequeue.left;
            MyBST.Node<Integer, Integer> right = dequeue.right;

            queue.enqueue(dequeue.left);
            queue.enqueue(dequeue.right);

            dequeue.left = right;
            dequeue.right = left;
        }


    }


}
