package ctci.Chapter4;

import BST.MyBST;

/**
 * Created by fkruege on 4/30/17.
 */
public class TreeIsSubTree4_10 {

    public boolean containsTree(MyBST<Integer, Integer> MainTree,
                                MyBST<Integer, Integer> SubTree) {

        return isSubTree(MainTree.getRoot(), SubTree.getRoot());
    }

    private boolean isSubTree(MyBST.Node<Integer, Integer> mainTreeNode,
                              MyBST.Node<Integer, Integer> subTreeNode) {

        boolean isSame = checkSubTree(mainTreeNode, subTreeNode);

        if (isSame) {
            return true;
        }


        if (mainTreeNode == null || subTreeNode == null) {
            return false;
        }

        return isSubTree(mainTreeNode.left, subTreeNode)
                ||
                isSubTree(mainTreeNode.right, subTreeNode);

    }

    private boolean checkSubTree(MyBST.Node<Integer, Integer> mainTreeNode,
                                 MyBST.Node<Integer, Integer> subTreeNode) {

        if(subTreeNode == null){
            return true;
        }

        if(mainTreeNode == null){
            return false;
        }

        if (!mainTreeNode.value.equals(subTreeNode.value)) {
            return false;
        }

        return checkSubTree(mainTreeNode.left, subTreeNode.left)
                &&
                checkSubTree(mainTreeNode.right, subTreeNode.right);


    }

}
