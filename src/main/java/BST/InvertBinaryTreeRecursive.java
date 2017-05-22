package BST;

/**
 * Created by fkruege on 5/3/17.
 */
public class InvertBinaryTreeRecursive implements InvertTree{

    public void invertTree(MyBinaryTree binaryTree) {
        invert(binaryTree.getRoot());
    }

    private MyBST.Node<Integer, Integer> invert(MyBST.Node<Integer, Integer> node) {

        if(node == null){
            return null;
        }

        MyBST.Node<Integer, Integer> right = invert(node.right);
        MyBST.Node<Integer, Integer> left = invert(node.left);

        node.left = right;
        node.right = left;

        return node;
    }


}
