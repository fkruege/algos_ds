package sorting;

import org.junit.Assert;
import sorting.Sort;

import java.util.Random;

/**
 * Created by fkruege on 1/15/17.
 */
public class SortTest {

    private Sort _sort;

    public SortTest(Sort sort) {
        _sort = sort;
    }

    public void runTestSuite() {
//        test_sort1();
        test_sort2();
        test_sort3();
        test_sort4();
        test_sort5();
        test_random();

    }

    private void test_sort1() {
        int[] a = new int[]{1};
        _sort.sort(a);
        validateSort(a);
    }

    private void test_sort2() {
        int[] a = new int[]{9, 0};
        _sort.sort(a);
        validateSort(a);
    }


    private void test_sort3() {
        int[] a = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        _sort.sort(a);
        validateSort(a);
    }


    private void test_sort4() {
        int[] a = new int[]{3, 6, 9, 3, 6, 9, 3, 6, 9};
        _sort.sort(a);
        validateSort(a);
    }


    private void test_sort5() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        _sort.sort(a);
        validateSort(a);
    }

    private void test_random() {
        Random rnd = new Random();
        int size = 10000;
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = rnd.nextInt();
        }

        _sort.sort(a);
        validateSort(a);

    }

    private void validateSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
            if (i == a.length - 2) {
                System.out.print(a[i + 1]);
            }
            Assert.assertTrue(a[i] <= a[i + 1]);
        }
        System.out.println();

    }


}
