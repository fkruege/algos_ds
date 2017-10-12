package ctci.Chapter8.Question11;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 6/2/17.
 */
public class CoinsTest {

    Coins coins;
    CoinsPractice practice;
//    int[] denoms = {1, 5, 10, 25};
//    int[] denoms = { 5, 10};
    int[] denoms = { 1, 2, 3};

    @Before
    public void before() {

        coins = new Coins();
        practice = new CoinsPractice();
    }

    @Test
    public void calculateChange() throws Exception {
        int goal = 25;
        List<List<Integer>> lists = coins.calculateChange(goal);
        int numberWays = CoinsReference.makeChange(goal, denoms);
        assertEquals(numberWays, lists.size());
    }

    @Test
    public void waysCount() {
        int goal = 5;
        int expected = CoinsReferenceBasic.makeChange(goal, denoms);
        int actual = practice.countWays(goal, denoms);
        int otherReference = numCombos(goal);
        List<List<Integer>> lists = coins.calculateChange(goal);
        assertEquals(expected, actual);
    }

    static int numCombos(int n) {
        int[] dyn = new int[n + 1];
        Arrays.fill(dyn, 0);
        dyn[0] = 1;
        for (int i = 1;  i <= n; i++) dyn[i] += dyn[i - 1];
        for (int i = 5;  i <= n; i++) dyn[i] += dyn[i - 5];
        for (int i = 10; i <= n; i++) dyn[i] += dyn[i - 10];
        for (int i = 25; i <= n; i++) dyn[i] += dyn[i - 25];
        return dyn[n];
    }

}