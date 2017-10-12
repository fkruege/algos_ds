package ctci.Chapter8.Question10;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class PaintFillerTest {

    int RED = 0;
    int GREEN = 1;
    int BLUE = 2;

    PaintFiller paintFiller;

    @Before
    public void setUp() throws Exception {
        paintFiller = new PaintFiller();
    }

    @Test
    public void fill_1() throws Exception {
        int[][] matrix = new int[3][3];
        matrix[0][0] = RED;
        matrix[0][1] = RED;
        matrix[0][2] = RED;

        matrix[1][0] = RED;
        matrix[1][1] = RED;
        matrix[1][2] = RED;

        matrix[2][0] = RED;
        matrix[2][1] = RED;
        matrix[2][2] = RED;

        paintFiller.fill(matrix, new Point(1, 1), GREEN);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                assertEquals(GREEN, matrix[i][j]);
            }
        }
    }


    @Test
    public void fill_2() throws Exception {
        int[][] matrix = new int[3][3];
        matrix[0][0] = RED;
        matrix[0][1] = RED;
        matrix[0][2] = RED;

        matrix[1][0] = RED;
        matrix[1][1] = BLUE;
        matrix[1][2] = RED;

        matrix[2][0] = RED;
        matrix[2][1] = RED;
        matrix[2][2] = RED;

        paintFiller.fill(matrix, new Point(1, 1), GREEN);
        assertEquals(GREEN, matrix[1][1]);
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                assertEquals(GREEN, matrix[i][j]);
//            }
//        }

    }

}