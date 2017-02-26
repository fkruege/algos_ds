package leetcode;

/**
 * Created by fkruege on 2/18/2017.
 */
// https://leetcode.com/problems/island-perimeter/?tab=Description
public class IslandPerimeter {


    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter = perimeter + testLeftRightSides(grid, i, j);
                    perimeter = perimeter + testTopBottomSides(grid, i, j);
                }
            }
        }

        return perimeter;
    }

    private int testLeftRightSides(int[][] grid, int i, int j) {
        int perimiter = 0;

        // test left side
        if (j - 1 >= 0) {
            // left side is water
            if (grid[i][j - 1] == 0) {
                perimiter++;
            }
        }
        // left side is the edge
        else {
            perimiter++;
        }
        // test right side
        if (j + 1 < grid[i].length) {
            if (grid[i][j + 1] == 0) {
                perimiter++;
            }
        } else {
            perimiter++;
        }

        return perimiter;
    }

    private int testTopBottomSides(int[][] grid, int i, int j) {
        int perimiter = 0;

        // test top side
        if (i - 1 >= 0) {
            // top side is water
            if (grid[i - 1][j] == 0) {
                perimiter++;
            }
        }
        // top side is the edge
        else {
            perimiter++;
        }
        // test bottom side
        if (i + 1 < grid.length) {
            if (grid[i + 1][j] == 0) {
                perimiter++;
            }
        } else {
            perimiter++;
        }

        return perimiter;
    }
}
