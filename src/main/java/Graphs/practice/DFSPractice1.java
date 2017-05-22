package Graphs.practice;

import edu.princeton.cs.algs4.Graph;

/**
 * Created by fkruege on 4/15/17.
 */
public class DFSPractice1 {


    private Graph graph;
    private int sourceVertex;
    private int[] edgeTo;

    public DFSPractice1(Graph graph, int sourceVertex) {
        this.graph = graph;
        this.sourceVertex = sourceVertex;

        edgeTo = new int[this.graph.V()];
        initEdges();
    }

    private void initEdges() {
        for (int i = 0; i < edgeTo.length; i++) {
            edgeTo[i] = Integer.MAX_VALUE;
        }
    }


    public void depthFirstSearch() {
        edgeTo[sourceVertex] = sourceVertex;
        dfs(sourceVertex);
    }

    public boolean marked(int vertex){
        return edgeTo[vertex] != Integer.MAX_VALUE;
    }

    private void dfs(int vertex) {
        for (Integer adjacentVertex : graph.adj(vertex)) {
            if (edgeTo[adjacentVertex] == Integer.MAX_VALUE) {
                edgeTo[adjacentVertex] = vertex;
                dfs(adjacentVertex);
            }
        }
    }
}
