package BreadthFirstSearch;

import com.sun.javafx.image.IntPixelGetter;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;


/**
 * Created by fkruege on 2/24/17.
 * http://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/BreadthFirstPaths.java.html
 */
public class MyBreadthFirst {

    private Graph _graph;

    private int _startingNode;
    private Queue<Integer> _queue;
    private boolean[] _visited;
    private int[] _edgetTo;
    private int[] _distanceTo;

    public MyBreadthFirst(Graph graph, int startingNode) {

        _graph = graph;
        _startingNode = startingNode;

        _queue = new Queue<Integer>();

        int vertexCount = graph.V();

        _visited = new boolean[vertexCount];
        _edgetTo = new int[vertexCount];
        _distanceTo = new int[vertexCount];

        for (int i = 0; i < vertexCount; i++) {
            _distanceTo[i] = Integer.MIN_VALUE;
            _edgetTo[i] = Integer.MIN_VALUE;
        }
    }

    public void breadthFirstSearch() {
        doBFS();
    }

    public boolean hasPathTo(int vertex) {

        return _visited[vertex];
    }

    public int distTo(int vertex) {
        return _distanceTo[vertex];
    }

    public Iterable<Integer> pathTo(int vertex) {
        Stack<Integer> stack = new Stack<Integer>();

        while (vertex != _startingNode) {
            stack.push(vertex);
            vertex = _edgetTo[vertex];
        }

        // push the last node on
        stack.push(_startingNode);

        return stack;
    }

    private void getPathTo(Stack<Integer> stack, int vertex) {
        stack.push(vertex);

        if (vertex == _startingNode) {
            return;
        }

        getPathTo(stack, _edgetTo[vertex]);
    }


    private void doBFS() {

        int start = _startingNode;

        _queue.enqueue(start);

        _edgetTo[start] = start;
        _distanceTo[start] = 0;
        _visited[start] = true;

        while (!_queue.isEmpty()) {
            int vertex = _queue.dequeue();

            for (Integer adjacent :
                    _graph.adj(vertex)) {

                if (_visited[adjacent]) {
                    continue;
                }

                _edgetTo[adjacent] = vertex;
                _distanceTo[adjacent] = _distanceTo[vertex] + 1;

                _queue.enqueue(adjacent);
                _visited[adjacent] = true;
            }

        }

    }


}
