package sorting;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by fkruege on 1/15/17.
 */
public class QuickSortTests {

    private QuickSort _sort;

    @Before
    public void before(){
        _sort = new QuickSort();
    }

    @Test
    public void test_Sorting1(){
        SortTest sortTest = new SortTest(_sort);
        sortTest.runTestSuite();
    }

}
