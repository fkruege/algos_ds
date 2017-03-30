package ctci.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 3/29/17.
 */
public class RotateMatrix1_7Test {

    @Test
    public void rotateLayers() throws Exception {

        int[][] matrix = new int[][]{
                {1000, 1100, 1200, 1300},
                {2000, 2100, 2200, 2300},
                {3000, 3100, 3200, 3300},
                {4000, 4100, 4200, 4300}
        };

        RotateMatrix1_7 rotate = new RotateMatrix1_7();
        boolean result = rotate.rotateLayers(matrix);
        assertTrue(result);
        verifyArray(matrix);
    }

    private void verifyArray(int[][] matrix) {

        int[][] expected = new int[][]{
                {4000, 3000, 2000, 1000},
                {4100, 3100, 2100, 1100},
                {4200, 3200, 2200, 1200},
                {4300, 3300, 2300, 1300}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                assertEquals(expected[i][j], matrix[i][j]);
            }
        }

    }

}