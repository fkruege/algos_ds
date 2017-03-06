package MinimumSpanningTrees;

import edu.princeton.cs.algs4.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fkruege on 3/5/17.
 */
public class MyKruskalsMSTTests {

    @Test
    public void test_MST1(){

        EdgeWeightedGraph graph = new EdgeWeightedGraph(3);
        graph.addEdge(new Edge(0, 1, 10));
        graph.addEdge(new Edge(0, 2, 100));
        graph.addEdge(new Edge(1, 2, 2));

        MyKruskalsMST kruskalsMST = new MyKruskalsMST(graph);

        kruskalsMST.findMST();

        Queue<Edge> edges = (Queue<Edge>) kruskalsMST.edges();
        Assert.assertEquals(2, edges.size());
        Edge edge_1_2 = edges.dequeue();
        Edge edge_0_1 = edges.dequeue();

        Assert.assertEquals(0, Double.compare(2, edge_1_2.weight()));
        Assert.assertEquals(0, Double.compare(10, edge_0_1.weight()));
    }

    @Test
    public void test_againstReference1(){

        String inputGraphFileName = "src/test/resources/mediumEWG.txt";
        In in = new In(inputGraphFileName);
        EdgeWeightedGraph G = new EdgeWeightedGraph(in);

        KruskalMST reference = new KruskalMST(G);
        MyKruskalsMST myKruskal = new MyKruskalsMST(G);

        myKruskal.findMST();

        Queue<Edge> referenceEdges = (Queue<Edge>) reference.edges();
        Queue<Edge> myEdges = (Queue<Edge>) myKruskal.edges();

        Assert.assertEquals(referenceEdges.size(), myEdges.size());

        while(!referenceEdges.isEmpty()){
            Edge myEdge = myEdges.dequeue();
            System.out.println(myEdge.toString());
            Assert.assertEquals(referenceEdges.dequeue().toString(), myEdge.toString());
        }


    }


}
