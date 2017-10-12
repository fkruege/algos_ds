package ctci.Chapter8.Question10;

import edu.princeton.cs.algs4.Queue;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by fkruege on 6/1/17.
 */
public class PaintFiller {

    int[][] matrix;
    boolean[] marked;
    int newColor;


    private void init(int[][] matrix, int newColor) {
        this.matrix = matrix;
        this.marked = new boolean[matrix.length * matrix[0].length];
        this.newColor = newColor;

    }

    public void fill(int[][] matrix, Point point, int newColor) {
        init(matrix, newColor);

        Queue<Point> queue = new Queue<>();
        int oldColor = matrix[point.x][point.y];

        matrix[point.x][point.y] = newColor;

        queue.enqueue(point);
        while (!queue.isEmpty()) {
            marked[translate2DTo1D(point)] = true;
            Point dequeue = queue.dequeue();
            Set<Point> adjacentPoints = getAdjacentPoints(dequeue, oldColor);
            for (Point adjacent : adjacentPoints) {
                if (!marked[translate2DTo1D(adjacent)]) {
                    matrix[adjacent.x][adjacent.y] = newColor;
                    queue.enqueue(adjacent);
                }
            }
        }

    }

    private Set<Point> getAdjacentPoints(Point point, int color) {
        Set<Point> points = new HashSet<>();

        // top left corner
        addPoint(points, new Point(point.x - 1, point.y - 1), color);
        // top mid
        addPoint(points, new Point(point.x - 1, point.y), color);
        // top right
        addPoint(points, new Point(point.x - 1, point.y + 1), color);

        // left
        addPoint(points, new Point(point.x, point.y - 1), color);
        // right
        addPoint(points, new Point(point.x, point.y + 1), color);

        // bottom left corner
        addPoint(points, new Point(point.x + 1, point.y - 1), color);
        // bottom mid
        addPoint(points, new Point(point.x + 1, point.y), color);
        // bottom right
        addPoint(points, new Point(point.x + 1, point.y + 1), color);

        return points;
    }

    private void addPoint(Set<Point> set, Point point, int color) {
        if (isPointValid(point, color)) {
            set.add(point);
        }
    }

    private int translate2DTo1D(Point point) {
        return (point.x * matrix.length) + (point.y % matrix.length);
    }

    private boolean isPointValid(Point point, int color) {
        if (point.x >= 0 && point.x <= matrix.length - 1) {
            if (point.y >= 0 && point.y <= matrix.length - 1) {
                if (matrix[point.x][point.y] == color) {
                    if (!marked[translate2DTo1D(point)]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
