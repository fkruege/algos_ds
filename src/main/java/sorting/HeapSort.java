package sorting;

/**
 * Created by fkruege on 1/22/17.
 */


public class HeapSort implements Sort {
    public void sort(int[] a) {
        int N = a.length;
        for (int k = N / 2; k > 0; k--) {
            sink(a, k, N);
        }

        while(N > 1){
            Util.exch(a, 0, N--);
            sink(a, 0, N);
        }

    }

    private void sink(int[] a, int k, int N) {
        // 0 offset
//        k = k -1;

        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && Util.less(a, j, j + 1)) {
                j++;
            }

            if (!Util.less(a, k, j)) {
                break;
            }

            Util.exch(a, k, j);
            k = j;
        }

    }


//    public static void sort(Comparable[] a)
//    {
//        int N = a.length;
//        for (int k = N/2; k >= 1; k--)
//            sink(a, k, N);
//        while (N > 1)
//        {
//            exch(a, 1, N--);
//            sink(a, 1, N);
//        }
//    }
}
