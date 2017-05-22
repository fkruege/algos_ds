package Graphs.practice;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

public class BFSPractice1 {

    private final Graph graph;
    private final int sourceVertex;
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distanceTo;
    Queue<Integer> queue;

    public BFSPractice1(Graph graph, int sourceVertex) {
        this.graph = graph;
        this.sourceVertex = sourceVertex;
        this.queue = new Queue<Integer>();

        marked = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        distanceTo = new int[graph.V()];

        init();

    }

    public void breadthFirstSearch() {
        bfs();
    }

    private void init() {
        for (int i = 0; i < marked.length; i++) {
            marked[i] = false;
            edgeTo[i] = Integer.MIN_VALUE;
            distanceTo[i] = Integer.MIN_VALUE;
        }
    }

    private void bfs() {
        int distance = 0;

        queue.enqueue(sourceVertex);
        marked[sourceVertex] = true;
        edgeTo[sourceVertex] = sourceVertex;
        distanceTo[sourceVertex] = distance;

        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();
            for (Integer adjacent : graph.adj(vertex)) {
                if (!marked[adjacent]) {
                    queue.enqueue(adjacent);
                    marked[adjacent] = true;
                    edgeTo[adjacent] = vertex;
                    distanceTo[adjacent] = distanceTo[vertex] + 1;
                }
            }
        }
    }

    public boolean hasPathTo(int vertex) {
        return marked[vertex];
    }

    public int distTo(int vertex) {
        return distanceTo[vertex];
    }

    public Iterable<Integer> pathTo(int vertex) {

        Stack<Integer> stack = new Stack<Integer>();
        if (marked[vertex]) {
            stack.push(vertex);

            int parentVertex = vertex;
            while (marked[parentVertex] && parentVertex != sourceVertex) {
                stack.push(edgeTo[parentVertex]);
                parentVertex = edgeTo[parentVertex];
            }
        }
        return stack;
    }


}
