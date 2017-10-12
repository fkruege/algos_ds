package ctci.Chapter8.Question11;

import java.util.*;

/**
 * Created by fkruege on 6/2/17.
 */
public class Coins {

    private static final int QUARTER = 25;
    private static final int DIME = 10;
    private static final int NICKEL = 5;
    private static final int PENNY = 1;


    private int goal = 0;
    private List<List<Integer>> combinations;

    public List<List<Integer>> calculateChange(int goal) {
        combinations = new ArrayList<>();
        this.goal = goal;

        List<Integer> available = new ArrayList<>();
        available.add(PENNY);
        available.add(NICKEL);
        available.add(DIME);
        available.add(QUARTER);

        getChange(0, -1, new ArrayList<>(), available);

        return combinations;
    }

    private void getChange(int currentTotal, int previousCoin, List<Integer> coins, List<Integer> available) {
        if (currentTotal == goal) {
            combinations.add(new ArrayList<>(coins));
            return;
        }

        for (int coin : available) {
            if (coin >= previousCoin) {
                tryChange(currentTotal, coin, coins, available);
            }
        }
    }

    private void tryChange(int currentTotal, int newCoin, List<Integer> coins, List<Integer> available) {
        if (currentTotal + newCoin <= goal) {
            coins.add(newCoin);
            getChange(currentTotal + newCoin, newCoin, coins, available);
            coins.remove(coins.size() - 1);
        }
    }


}
