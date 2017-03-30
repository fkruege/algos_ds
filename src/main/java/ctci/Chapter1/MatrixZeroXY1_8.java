package ctci.Chapter1;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by fkruege on 3/27/17.
 */
public class MatrixZeroXY1_8 {

    public void zeroOutRowColumn(int[][] matrix){
        Stack<Integer> zeroElements = new Stack<Integer>();
        int matrixWidth = matrix[0].length;

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] == 0){

                }
            }
        }




    }

    private int translate2DTo1DAddr(int row, int col, int matrixWidth){
        int addr = row * matrixWidth + col;
        return addr;
    }
}
