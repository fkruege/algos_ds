package ctci.Chapter8.Question11;

/**
 * Created by fkruege on 6/4/17.
 */
public class CoinsPractice {
    private int goal;
    private int[] availableCoins;

    public int countWays(int goal, int[] availableCoins) {
        this.goal = goal;
        this.availableCoins = availableCoins;
        int numberWays = ways(0, -1);
        return numberWays;
    }

    private int ways(int currentAmt, int previousCoin) {
        if (currentAmt == goal) {
            return 1;
        }

        int numberWays = 0;

        for (int i = 0; i < availableCoins.length; i++) {
            int coin = availableCoins[i];
            if (coin >= previousCoin) {
                int saveAmt = currentAmt + coin;
                if (saveAmt > goal) {
                    break;
                }
                numberWays += ways(saveAmt, coin);
            }
        }

        return numberWays;
    }


}
