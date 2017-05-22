package BST;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by fkruege on 5/4/17.
 */
public class InvertTreeTester {

    public void testInversion(InvertTree treeInverter) {
        runTest1(treeInverter);
    }

    private void runTest1(InvertTree treeInverter) {
        MyBinaryTree binaryTree = new MyBinaryTree();
        binaryTree.add(new Integer[]{0, 1, 2, 3, 4, 5, 6});

        treeInverter.invertTree(binaryTree);

        List<List<Integer>> levelOrder = binaryTree.getDepthList();
        assertEquals(4, levelOrder.size());
        assertEquals(0, levelOrder.get(0).get(0).intValue());
        assertEquals(2, levelOrder.get(1).get(0).intValue());
        assertEquals(1, levelOrder.get(1).get(1).intValue());

        assertEquals(6, levelOrder.get(2).get(0).intValue());
        assertEquals(5, levelOrder.get(2).get(1).intValue());
        assertEquals(4, levelOrder.get(2).get(2).intValue());
        assertEquals(3, levelOrder.get(2).get(3).intValue());

    }


}
