package sorting;

/**
 * Created by fkruege on 1/14/17.
 */
public class QuickSort implements Sort {


    public void sort(int[] a) {
        sort(a, 0, a.length-1);
    }

    private void sort(int[] a, int lo, int high) {

        if (high <= lo) {
            return;
        }
        int j = partition(a, lo, high);
        sort(a, lo, j-1);
        sort(a, j + 1, high);
    }

    private int partition(int[] a, int lo, int hi) {

        int i = lo;
        int j = hi + 1;


        while (true) {
            // scan from left to right until I find an element
            // greater than a[lo]
            while (a[lo] >= a[++i]) {
                if (i == hi) {
                    break;
                }
            }

            // scan from right to left until I find an element
            // less than a[lo]
            while (a[lo] <= a[--j]) {
                if (j == lo) {
                    break;
                }
            }

            // check if i & j cross each other
            if (i >= j) {
                break;
            }

            Util.exch(a, i, j);
        }

        Util.exch(a, lo, j);

        // at this point all elements to the left are less than
        // and elements to the right are greater than
        return j;

    }


}
