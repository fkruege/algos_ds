package ctci.Chapter4;

import BST.MyBST;

/**
 * Created by fkruege on 4/16/17.
 */
public class IsValidBST4_5 {

    public boolean isBST(MyBST.Node<Integer, Integer> node) {
        return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    public boolean isBST(MyBST.Node<Integer, Integer> node, int minValue, int maxValue) {
        if (node == null) {
            return true;
        }

        MyBST.Node<Integer, Integer> left = node.left;
        MyBST.Node<Integer, Integer> right = node.right;

        int leftValue = left == null ? Integer.MIN_VALUE : left.value;
        int rightValue = right == null ? Integer.MAX_VALUE : right.value;

        if (node.value < minValue || node.value >= maxValue) {
            return false;
        } else if (leftValue > node.value || rightValue <= node.value) {
            return false;
        } else {
            return isBST(node.left, minValue, node.value) && isBST(node.right, node.value, maxValue);
        }


    }
}
