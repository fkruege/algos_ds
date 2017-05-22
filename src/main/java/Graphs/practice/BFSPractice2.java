package Graphs.practice;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Queue;

import java.util.Stack;

/**
 * Created by fkruege on 4/26/17.
 */
public class BFSPractice2 {

    private final Graph graph;
    private final int sourceVertex;

    private int[] edgeTo;
    private int[] distanceTo;
    private Queue<Integer> visitQueue;

    public BFSPractice2(Graph graph, int sourceVertex) {
        this.graph = graph;
        this.sourceVertex = sourceVertex;
    }

    private void init(){
        visitQueue = new Queue<Integer>();
        edgeTo = new int[graph.V()];
        for(int i = 0 ; i < graph.V(); i++){
            distanceTo[i] = Integer.MIN_VALUE;
            edgeTo[i] = Integer.MIN_VALUE;
        }
    }

    public void breadthFirstSearch(){

        visitQueue.enqueue(sourceVertex);
        edgeTo[sourceVertex] = sourceVertex;
        distanceTo[sourceVertex] = 0;

        while(!visitQueue.isEmpty()){

            Integer vertex = visitQueue.dequeue();

            for(Integer adjacent: graph.adj(vertex)){
                if(edgeTo[adjacent] == Integer.MIN_VALUE){
                    visitQueue.enqueue(adjacent);
                    edgeTo[adjacent] = vertex;
                    distanceTo[adjacent] = distanceTo[vertex] + 1;
                }
            }
        }
    }
}
