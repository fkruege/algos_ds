package ctci.Chapter8.Question12;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 6/7/17.
 */
public class Queens {


    List<List<Point>> positions;
    private int[][] matrix;
    private int numberOfQueens;


    public List<List<Point>> getQueensPositions(int[][] matrix, int numberOfQueens) {
        this.matrix = matrix;
        this.numberOfQueens = numberOfQueens;
        positions = new ArrayList<>();
        return null;
    }

    private void positionQueens(Point currentPosition, int queenCount) {

        if (queenCount == 0 && isPositionValid(currentPosition)) {
            markPosition(currentPosition);
            positionQueens(getNextPoint(currentPosition), queenCount + 1);
        }


    }

    private Point getNextPoint(Point point) {
        if (point.y + 1 < matrix.length) {
            return new Point(point.x, point.y + 1);
        }

        if (point.x + 1 < matrix.length) {
            return new Point(point.x + 1, 0);
        }

        return null;
    }

    private boolean isPositionValid(Point point) {
        return point.x >= 0 && point.x < matrix.length && point.y >= 0 && point.y < matrix.length;
    }

    private void markPosition(Point point) {
        matrix[point.x][point.y] = 1;
    }


}
