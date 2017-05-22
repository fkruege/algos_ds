package ctci.Chapter4;


import BST.MyBST;

/**
 * Created by fkruege on 4/16/17.
 */
public class CommonAncestor4_8_BST {


    private MyBST<Integer, Integer> bst;

    public CommonAncestor4_8_BST(MyBST<Integer, Integer> bst) {
        this.bst = bst;
    }


    public MyBST.Node<Integer, Integer> findAncestor(int a, int b) {
        MyBST.Node<Integer, Integer> root = bst.getRoot();

        return findCommonAncestor(null, root, a, b);

    }

    private MyBST.Node<Integer, Integer> findCommonAncestor(MyBST.Node<Integer, Integer> parent,
                                                           MyBST.Node<Integer, Integer> node,
                                                           int a, int b) {

        if (node == null) {
            return null;
        }

        int comparedToA = node.value.compareTo(a);
        int comparedToB = node.value.compareTo(b);

        if (comparedToA == 0 && comparedToB == 0) {
            return parent;
        }

        // nodes are both on the right
        if (comparedToA == -1 && comparedToB == -1) {
            return findCommonAncestor(node, node.right, a, b);

        }

        // nodes are on the left
        if (comparedToA == 1 && comparedToB == 1) {
            return findCommonAncestor(node, node.left, a, b);
        }

        // nodes are split, one left and one on right so this is the common ancestor
        if ((comparedToA == -1 && comparedToB == 1) || (comparedToA == 1 && comparedToB == -1)) {
            return node;
        }

        return parent;

    }


}
