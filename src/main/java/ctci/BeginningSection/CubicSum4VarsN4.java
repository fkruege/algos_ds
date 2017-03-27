package ctci.BeginningSection;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 3/20/17.
 */
public class CubicSum4VarsN4 {

    public void run(List<Pair<Integer, Integer>> pairList1, List<Pair<Integer, Integer>> pairList2) {

        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                for (int c = 1; c <= 1000; c++) {
                    for (int d = 1; d <= 1000; d++) {
                        int cubicSum1 = (int) (Math.pow(a, 3) + Math.pow(b, 3));
                        int cubicSum2 = (int) (Math.pow(c, 3) + Math.pow(d, 3));
                        if (cubicSum1 == cubicSum2) {
                            String msg =
                                    String.format("%1$d = %2$d^3 + %3$d^3 = %4$d^3 + %5$d^3",
                                            cubicSum1, a, b, c, d);
                            Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(a,b);
                            Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(c,d);
                            pairList1.add(pair1);
                            pairList2.add(pair2);

                            System.out.println(msg);
                        }
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        CubicSum4VarsN4 calc = new CubicSum4VarsN4();
        List<Pair<Integer, Integer>> listPair1 = new ArrayList<Pair<Integer, Integer>>();
        List<Pair<Integer, Integer>> listPair2 = new ArrayList<Pair<Integer, Integer>>();
        calc.run(listPair1, listPair2);
    }


}

