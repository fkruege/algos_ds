package GraphSearch;

import edu.princeton.cs.algs4.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fkruege on 2/26/2017.
 */
public class MyConnctedComponentGraphTests1 {


    // simple graph test
    @Test
    public void test1() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);

        MyConnectedComponentGraph connectedComponent = new MyConnectedComponentGraph(graph);
        connectedComponent.findConnectedComponents();
        Assert.assertEquals(2, connectedComponent.count());

        Assert.assertEquals(4, connectedComponent.size(0));
        Assert.assertEquals(4, connectedComponent.size(1));
        Assert.assertEquals(4, connectedComponent.size(2));
        Assert.assertEquals(4, connectedComponent.size(3));
        Assert.assertEquals(1, connectedComponent.size(4));

        Assert.assertEquals(0, connectedComponent.id(0));
        Assert.assertEquals(0, connectedComponent.id(1));
        Assert.assertEquals(0, connectedComponent.id(2));
        Assert.assertEquals(0, connectedComponent.id(3));
        Assert.assertEquals(1, connectedComponent.id(4));

        Assert.assertTrue(connectedComponent.connected(0, 0));
        Assert.assertTrue(connectedComponent.connected(0, 1));
        Assert.assertTrue(connectedComponent.connected(0, 2));
        Assert.assertTrue(connectedComponent.connected(0, 3));

        Assert.assertTrue(connectedComponent.connected(4, 4));
        Assert.assertFalse(connectedComponent.connected(0, 4));
    }


}
