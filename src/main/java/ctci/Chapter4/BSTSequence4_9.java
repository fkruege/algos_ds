package ctci.Chapter4;

import BST.MyBST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static ctci.Chapter4.BSTSequence4_9.NodeType.LEFT;
import static ctci.Chapter4.BSTSequence4_9.NodeType.RIGHT;
import static ctci.Chapter4.BSTSequence4_9.NodeType.ROOT;

/**
 * Created by fkruege on 4/29/17.
 */
public class BSTSequence4_9 {

    public enum NodeType {
        LEFT, RIGHT, ROOT
    }

    public static class PrefixSuffix {
        public Element Prefix;
        public Element Suffix1;
        public Element Suffix2;
    }

    public static class Element {
        NodeType nodeType;
        Integer integer;

        public Element(NodeType nodeType, Integer integer) {
            this.nodeType = nodeType;
            this.integer = integer;
        }
    }

    List<List<Integer>> permutationsList = new ArrayList<List<Integer>>();

    public List<List<Integer>> getArrayPermutations(BST.MyBST<Integer, Integer> bst) {
        permutation(bst.getRoot(), ROOT, new ArrayList<PrefixSuffix>());

        return null;
    }


    private HashMap<Integer, List<List<Integer>>> leftRightLists = new HashMap<Integer, List<List<Integer>>>();

    private void permutation(MyBST.Node<Integer, Integer> node,
                             NodeType nodeType, List<PrefixSuffix> prefixSuffixList) {
        if (node == null) {
            return;
        }

        permutation(node.left, LEFT, prefixSuffixList);
        permutation(node.right, RIGHT, prefixSuffixList);

        List<List<Integer>> listsOfList = leftRightLists.get(node.value);
        if (listsOfList == null) {
            leftRightLists.put(node.value, new ArrayList<List<Integer>>());
        }

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(node.value);
        listsOfList.add(intList);
    }

    private boolean checkRoot(MyBST.Node<Integer, Integer> node) {
        List<List<Integer>> leftIntegers = null;
        if (node.left != null) {
            leftIntegers = leftRightLists.get(node.left.value);
        }

        List<List<Integer>> rightIntegers = null;
        if (node.right != null) {
            rightIntegers = leftRightLists.get(node.right.value);
        }

        if (leftIntegers != null && rightIntegers != null) {
            // weave lists
            for (int i = 0; i < leftIntegers.size(); i++) {
                List<Integer> left = leftIntegers.get(i);

                for (int j = 0; j < rightIntegers.size(); j++) {
                    // concatenate the 2 lists

                }


            }

        }

        return true;
    }


}
