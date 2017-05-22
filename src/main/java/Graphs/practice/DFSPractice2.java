package Graphs.practice;

import edu.princeton.cs.algs4.Graph;

/**
 * Created by fkruege on 4/26/17.
 */
public class DFSPractice2 {

    private final Graph graph;
    private final int sourceVertex;

    private int edgeTo[];

    public DFSPractice2(Graph graph, int sourceVertex) {
        this.graph = graph;
        this.sourceVertex = sourceVertex;
    }

    private void initEdgeTo() {
        edgeTo = new int[graph.V()];
        for (int i = 0; i < graph.V(); i++) {
            edgeTo[i] = Integer.MIN_VALUE;
        }
    }

    private void depthFirstSearch() {
        edgeTo[sourceVertex] = sourceVertex;
        dfs(sourceVertex);
    }

    private void dfs(int vertex) {
        for (Integer adjacentVertex : graph.adj(vertex)) {
            if (edgeTo[adjacentVertex] == Integer.MIN_VALUE) {
                edgeTo[adjacentVertex] = vertex;
                dfs(adjacentVertex);
            }
        }
    }


}
