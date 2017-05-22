package ctci.Chapter8.Question2;

import ctci.CtCILibrary.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/20/17.
 */
public class RobotGridTest {
    RobotGrid robotGrid;
    RobotReference robotReference;

    @Before
    public void setUp() throws Exception {
        robotGrid = new RobotGrid();
        robotReference = new RobotReference();
    }

    @Test
    public void findDestination() throws Exception {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[1][0] = 1;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;

        Stack<Point> points = robotGrid.findDestination(matrix);
        assertTrue(points.pop().equals(new Point(0, 0)));
        assertTrue(points.pop().equals(new Point(1, 0)));
        assertTrue(points.pop().equals(new Point(2, 0)));
        assertTrue(points.pop().equals(new Point(2, 1)));
        assertTrue(points.pop().equals(new Point(2, 2)));
    }

   @Test
    public void findDestination2(){

       int size = 5;
       int[][] maze = AssortedMethods.random_1_0_Matrix(size, size, 70);

       AssortedMethods.printMatrix(maze);
       Stack<Point> points = robotGrid.findDestination(maze);

       while(!points.isEmpty()){
           System.out.println(points.pop());
       }


       assertNotNull(points);
//
//       ArrayList<Point> pathA = QuestionA.getPath(maze);
//       ArrayList<Point> pathB = QuestionB.getPath(maze);
//       if (pathA != null) {
//           System.out.println(pathA.toString());
//       } else {
//           System.out.println("No path found.");
//       }
//
//       if (pathB != null) {
//           System.out.println(pathB.toString());
//       } else {
//           System.out.println("No path found.");
//       }


   }


}