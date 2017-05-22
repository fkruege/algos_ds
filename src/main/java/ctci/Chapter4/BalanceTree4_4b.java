package ctci.Chapter4;

import BST.MyBST;

/**
 * Created by fkruege on 4/16/17.
 */
public class BalanceTree4_4b {

    public boolean isBalanced(MyBST.Node node){
        return checkHeight(node) != Integer.MIN_VALUE;
    }

    public int checkHeight(MyBST.Node node){
        if(node == null){
            return -1;
        }

        int leftHeight = checkHeight(node.left);
        if(leftHeight == Integer.MIN_VALUE ){
            return Integer.MIN_VALUE;
        }

        int rightHeight = checkHeight(node.right);
        if(rightHeight == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        int heightDiff = leftHeight - rightHeight;
        if(Math.abs(heightDiff) > 1){
            return Integer.MIN_VALUE;
        }else
        {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }



}
