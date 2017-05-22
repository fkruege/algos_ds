package ctci.Chapter8.Question2;

import com.sun.tools.javac.util.Pair;

import java.awt.*;
import java.util.Stack;

public class RobotGrid {

    private Point[] pathTo;

    public Stack<Point> findDestination(int[][] grid) {
        pathTo = new Point[grid.length * grid.length];
        boolean result = dfsToDesintation(new Point(0, 0), grid);

        if (result) {
            return tracePoints(grid);
        } else {
            return new Stack<>();
        }

    }

    private Stack<Point> tracePoints(int[][] grid) {
        Stack<Point> stack = new Stack<>();
        int destinationCoordinate = grid.length - 1;
        Point destination = new Point(destinationCoordinate, destinationCoordinate);
        Point home = new Point(0, 0);

        Point current = destination;
        stack.push(current);
        while (current != null && !current.equals(home)) {
            current = pathTo[translatePointToX(current, grid)];
            stack.push(current);
        }
        return stack;
    }

    private boolean dfsToDesintation(Point point, int[][] grid) {
        Pair<Point, Point> adjacentPoints = getAdjacentPoints(point, grid);

        if (adjacentPoints.fst != null) {
            if (visitPoint(point, adjacentPoints.fst, grid)) {
                return true;
            }
        }


        if (adjacentPoints.snd != null) {
            if (visitPoint(point, adjacentPoints.snd, grid)) {
                return true;
            }
        }

        return false;
    }

    private boolean visitPoint(Point parentPoint, Point currentPoint, int[][] grid) {

        if (currentPoint != null) {
            markPoint(currentPoint, grid);
            int currentScalarIndex = translatePointToX(currentPoint, grid);
            pathTo[currentScalarIndex] = parentPoint;

            if (isDestination(currentPoint, grid)) {
                return true;
            }
            return dfsToDesintation(currentPoint, grid);
        }

        return false;
    }

    private Pair<Point, Point> getAdjacentPoints(Point point, int[][] grid) {

        Point right = null;
        Point below = null;

        // return point to the right
        int rightCol = point.y + 1;
        if (rightCol < grid[point.x].length) {
            if (!isMarked(point.x, rightCol, grid)) {
                right = new Point(point.x, rightCol);
            }
        }

        int rowBelow = point.x + 1;
        if (rowBelow < grid.length) {
            if (!isMarked(rowBelow, point.y, grid)) {
                below = new Point(rowBelow, point.y);
            }
        }

        return new Pair<>(right, below);
    }

    private boolean isMarked(int row, int col, int[][] grid) {
        return grid[row][col] == 0;
    }

    private void markPoint(Point point, int[][] grid) {
        grid[point.x][point.y] = 0;
    }

    private int translatePointToX(Point point, int[][] grid) {
        return (point.x * grid.length) + (point.y % grid.length);
    }

    private boolean isDestination(Point point, int[][] grid) {
        return (point.x == grid.length - 1) && (point.y == grid.length - 1);
    }


}
