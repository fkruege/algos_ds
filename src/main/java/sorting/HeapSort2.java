package sorting;

/**
 * Created by fkruege on 1/22/17.
 */
public class HeapSort2 implements Sort {

    public void sort(int[] a) {

        // create a ordered binary heap
        // starting at N/2 sink the elements
        int N = a.length;

        for (int k = N / 2; k >= 0; k--) {
            sink(a, k - 1, N);
        }


        // remove the root Max element and swap it with the
        // last element and then sink the new element at the root
    }

    private void sink(int[] a, int k, int N) {

        while (2 * k + 1 <= N) {
            int j = 2 * k ;
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

}
