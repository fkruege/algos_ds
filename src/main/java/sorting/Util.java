package sorting;

/**
 * Created by fkruege on 1/15/17.
 */
public class Util {

    public static void exch(int[] a, int i, int j){
        int save = a[i];
        a[i] = a[j];
        a[j] = save;
    }

public static boolean less(int[] a, int j, int k){
        return a[j] < a[k];
    }


}
