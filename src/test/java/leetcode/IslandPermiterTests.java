package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fkruege on 2/18/2017.
 */
public class IslandPermiterTests {

    @Test
    public void test_perimiter1(){

        int[][] grid = new int[][]{
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };

        IslandPerimeter islandPerimeter = new IslandPerimeter();
        int i = islandPerimeter.islandPerimeter(grid);
        Assert.assertEquals(16, i);
    }


    @Test
    public void test_perimiter2(){

        int[][] grid = new int[][]{
                {1},
                {0},
        };


        IslandPerimeter islandPerimeter = new IslandPerimeter();
        int i = islandPerimeter.islandPerimeter(grid);
        Assert.assertEquals(4, i);
    }


}
