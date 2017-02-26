package sorting;

/**
 * Created by fkruege on 1/15/17.
 */
public class MergeSort implements Sort {

    private int[] _aux;


    public void sort(int[] a) {
        _aux = new int[a.length];
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + ((hi - lo) / 2);
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private void merge(int[] a, int lo, int mid, int hi) {

        // copy a[] to the aux[] array
        for (int i = lo; i <= hi; i++) {
            _aux[i] = a[i];
        }

        // using the midpoint as the divider
        // compare the left partition with the right partition
        // and putting the smaller one in a[]
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                // exhausted the left side so use the right side's elements
                a[k] = _aux[j++];
            } else if (j > hi) {
                // exhausted the right side so use the left side's elements
                a[k] = _aux[i++];
            } else if (a[i] <= a[j]) {
                // use the left side
                a[k] = a[i++];
            } else {
                // use the right side
                a[k] = a[j++];
            }

        }


    }


}
