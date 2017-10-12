package ctci.Chapter8.Question6;

import edu.princeton.cs.algs4.Stack;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/27/17.
 */
public class TowersOfHanoiTest {
    TowersOfHanoi towers;

    @Before
    public void setUp() throws Exception {
        towers = new TowersOfHanoi();
    }

    @Test
    public void solve() throws Exception {
        Stack<Integer> tower1 = new Stack<>();
        tower1.push(3);
        tower1.push(2);
        tower1.push(1);

        Stack<Integer> tower2 = new Stack<>();
        Stack<Integer> tower3 = new Stack<>();

        towers.solve(tower1, tower2, tower3);

        assertTrue(tower1.isEmpty());
        assertTrue(tower2.isEmpty());
    }

    @Test
    public void solve4() throws Exception {
        Stack<Integer> tower1 = getTower(4);
        Stack<Integer> tower2 = new Stack<>();
        Stack<Integer> tower3 = new Stack<>();

        int count = towers.solve(tower1, tower2, tower3);

        assertTrue(tower1.isEmpty());
        assertTrue(tower2.isEmpty());
        assertEquals(15, count);
    }

    private Stack<Integer> getTower(int numDiscs){
        Stack<Integer> tower = new Stack<>();
        for(int i = numDiscs; i > 0; i--){
           tower.push(i);
        }
        return tower;
    }

}