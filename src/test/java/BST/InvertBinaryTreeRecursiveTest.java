package BST;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by fkruege on 5/3/17.
 */
public class InvertBinaryTreeRecursiveTest {

    InvertBinaryTreeRecursive invertBinaryTree;
    InvertTreeTester invertTreeTester;


    @Before
    public void before() {
        invertBinaryTree = new InvertBinaryTreeRecursive();
        invertTreeTester = new InvertTreeTester();
    }


    @Test
    public void invertTree() throws Exception {
        invertTreeTester.testInversion(invertBinaryTree);
    }

}