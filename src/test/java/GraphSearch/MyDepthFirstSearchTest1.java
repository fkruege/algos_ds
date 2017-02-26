package GraphSearch;

import edu.princeton.cs.algs4.DepthFirstSearch;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fkruege on 2/26/2017.
 */
public class MyDepthFirstSearchTest1 {

    @Before
    public void before() {

    }

    @Test
    public void test1() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);

        MyDepthFirstSearch depthFirst = new MyDepthFirstSearch(graph, 0);
        depthFirst.depthFirstSearch();

        Assert.assertTrue(depthFirst.marked(0));
        Assert.assertTrue(depthFirst.marked(1));
        Assert.assertTrue(depthFirst.marked(2));
        Assert.assertTrue(depthFirst.marked(3));
        Assert.assertFalse(depthFirst.marked(4));

        Assert.assertEquals(4, depthFirst.count());

    }


}
