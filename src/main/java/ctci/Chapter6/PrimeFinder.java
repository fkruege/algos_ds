package ctci.Chapter6;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

    static final boolean UNMARKED = false;
    static final boolean MARKED = true;

    public List<Integer> getPrimesUpTo(int n) {
        boolean[] flags = createFlagsArray(n);
        return findPrimes(flags, n);
    }

    private List<Integer> findPrimes(boolean[] flags, int max) {

        List<Integer> primeList = new ArrayList<>();

        for (int i = 2; i <= max; i++) {
            if (flags[i] == UNMARKED) {
                primeList.add(i);
                markOffNonPrimes(flags, i, i * i);
            }
        }

        return primeList;
    }

    private void markOffNonPrimes(boolean[] flags, int divisor, int start) {
        for (int i = start; i < flags.length; i++) {

            if (flags[i] == MARKED) {
                continue;
            }

            if (i % divisor == 0) {
                flags[i] = MARKED;
            }

        }
    }

    private boolean[] createFlagsArray(int max) {
        boolean[] flags = new boolean[max + 1];
        return flags;
    }


}
