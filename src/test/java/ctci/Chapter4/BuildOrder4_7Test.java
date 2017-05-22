package ctci.Chapter4;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Topological;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/16/17.
 */
public class BuildOrder4_7Test {

    Digraph graph;
    BuildOrder4_7 buildOrder;

    @Before
    public void before() {
        graph = new Digraph(7);
        graph.addEdge(5, 2);
        graph.addEdge(5, 1);
        graph.addEdge(5, 0);
        graph.addEdge(2, 0);
        graph.addEdge(1, 0);
        graph.addEdge(1, 4);
        graph.addEdge(0, 4);
        graph.addEdge(3, 6);

        buildOrder = new BuildOrder4_7();
    }

    @Test
    public void topoSort() throws Exception {

        Iterable<Integer> integers = buildOrder.topoSort(graph);
        for (Integer i :
                integers) {
            System.out.print(i + ", ");
        }

        System.out.println();

        Topological topological = new Topological(graph);
        Iterable<Integer> order = topological.order();
        for (Integer i :
                order) {
            System.out.print(i + ", ");
        }
    }

}