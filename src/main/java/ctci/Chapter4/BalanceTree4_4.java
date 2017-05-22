package ctci.Chapter4;

import BST.MyBST;

/**
 * Created by fkruege on 4/16/17.
 */
public class BalanceTree4_4 {


    public boolean isBalanced(MyBST.Node node){

        if(node == null){
            return true;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        int difference = leftHeight - rightHeight;
        if(Math.abs(difference) > 1){
            return false;
        }else{
            return isBalanced(node.left) && isBalanced(node.right);
        }

    }
//
//    private int getHeight(MyBST.Node node, int height){
//        if(node == null){
//            return height;
//        }
//
//        int leftHeight = getHeight(node.left, height + 1);
//        int rightHeight = getHeight(node.right, height + 1);
//
//        return Math.max(leftHeight, rightHeight);
//    }

    private int getHeight(MyBST.Node node){
        if(node == null){
            return -1;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }


}
