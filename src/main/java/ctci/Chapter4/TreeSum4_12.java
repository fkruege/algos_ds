package ctci.Chapter4;

import BST.MyBST;

/**
 * Created by fkruege on 4/30/17.
 */
public class TreeSum4_12 {

    public int NumberOfPathsWithSum(MyBST<Integer, Integer> bst, int desiredSum){
        return findSumAtPath(bst.getRoot(), desiredSum);

    }

    private int findSumAtPath(MyBST.Node<Integer, Integer> node, int desiredSum ){

        if(node == null){
            return 0;
        }

        int rootPathSums = findSumOfPaths(node, desiredSum, 0);
        int leftPathSums = findSumAtPath(node.left, desiredSum);
        int rightPathSums = findSumAtPath(node.right, desiredSum);

        return rootPathSums+leftPathSums+rightPathSums;

    }

    private int findSumOfPaths(MyBST.Node<Integer, Integer> node, int desiredSum, int currentSum){
        if(node == null){
            return 0;
        }

        int totalPaths = 0;
        currentSum += node.value;

        if(currentSum == desiredSum){
            totalPaths++;
        }

        totalPaths += findSumOfPaths(node.left, desiredSum, currentSum);
        totalPaths += findSumOfPaths(node.right, desiredSum, currentSum);

        return totalPaths;

    }
}
