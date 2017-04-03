package ctci.Chapter4;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fkruege on 4/2/17.
 */
public class TreeTraversal {

    public void inorderTraversal(MyBST<Integer, Integer> bst){

        MyBST<Integer, Integer>.Node root = bst.getRoot();
        StdOut.println();
        inOrder(root);
        StdOut.println();
    }

    private void inOrder(MyBST.Node node){

        if(node == null){
            return;
        }

        inOrder(node.left);
        StdOut.print(node.val + ", ");
        inOrder(node.right);

    }

    public void preorderTraversal(MyBST<Integer, Integer> bst){

        MyBST<Integer, Integer>.Node root = bst.getRoot();
        StdOut.println();
        preOrder(root);
        StdOut.println();
    }

    private void preOrder(MyBST.Node node){
        if(node == null){
            return;
        }

        StdOut.print(node.val + ", ");
        preOrder(node.left);
        preOrder(node.right);

    }



    public void postorderTraversal(MyBST<Integer, Integer> bst){

        MyBST<Integer, Integer>.Node root = bst.getRoot();
        StdOut.println();
        postOrder(root);
        StdOut.println();

    }

    private void postOrder(MyBST.Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        StdOut.print(node.val + ", ");
    }

    public void levelOrder(MyBST<Integer, Integer> bst){

        StdOut.println("Level Order traversal");

        MyBST<Integer, Integer>.Node root = bst.getRoot();
        Queue<Integer>  keys = new Queue<Integer>();
        Queue<MyBST<Integer, Integer>.Node> nodes = new Queue<MyBST<Integer, Integer>.Node>();
        nodes.enqueue(root);
        while(!nodes.isEmpty()){
            MyBST<Integer, Integer>.Node current = nodes.dequeue();
            if(current == null){
                continue;
            }

            keys.enqueue(current.val);
            nodes.enqueue(current.left);
            nodes.enqueue(current.right);
        }

        while(!keys.isEmpty()){
            StdOut.print(keys.dequeue() + ", ");
        }

    }
}
