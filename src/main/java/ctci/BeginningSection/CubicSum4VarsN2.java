package ctci.BeginningSection;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fkruege on 3/20/17.
 */
public class CubicSum4VarsN2 {

    public void run(List<Pair<Integer, Integer>> pairList1, List<Pair<Integer, Integer>> pairList2) {

        HashMap<Integer, List<Pair<Integer, Integer>>> mapSum = new HashMap<Integer, List<Pair<Integer, Integer>>>();

        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                int cubicSum = (int) (Math.pow(a, 3) + Math.pow(b, 3));

                Pair<Integer, Integer> cubicPair = new Pair<Integer, Integer>(a, b);

                List<Pair<Integer, Integer>> cubicPairs = mapSum.get(cubicSum);
                if (cubicPairs == null) {
                    cubicPairs = new ArrayList<Pair<Integer, Integer>>();
                    cubicPairs.add(cubicPair);
                    mapSum.put(cubicSum, cubicPairs);
                } else {
                    cubicPairs.add(cubicPair);
                }
            }
        }

        for (Integer i : mapSum.keySet()) {

            System.out.println("For Sum: " + i);
            List<Pair<Integer, Integer>> pairs = mapSum.get(i);
            for (Pair<Integer, Integer> pair : pairs) {
//                System.out.println(String.format("$1%d^3 + $2%d^3 = $3%d^3 + $4%d^3", pair.));
            }


        }

    }

    public static void main(String[] args) {
        CubicSum4VarsN2 calc = new CubicSum4VarsN2();
        List<Pair<Integer, Integer>> listPair1 = new ArrayList<Pair<Integer, Integer>>();
        List<Pair<Integer, Integer>> listPair2 = new ArrayList<Pair<Integer, Integer>>();
        calc.run(listPair1, listPair2);
    }


}

