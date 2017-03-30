package ctci.Chapter1;

/**
 * Created by fkruege on 3/29/17.
 */
public class RotateMatrix1_7 {

    public boolean rotateLayers(int[][] matrix){

        if(matrix.length == 0 || (matrix.length != matrix[0].length)){
            return false;
        }

        int n = matrix.length;
        for(int layer = 0; layer < n / 2; layer++){
            int first = layer;
            int last = n - 1 - layer;

            for(int i = first; i < last; i++){
                int offset = i - first;
                int top = matrix[first][i];

                // left -> top
                matrix[first][i] = matrix[last-offset][first];

                // bottom -> left
                matrix[last-offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top;
            }
        }

        return true;

    }
}
