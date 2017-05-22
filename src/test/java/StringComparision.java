import interviews.Simple;

/**
 * Created by fkruege on 4/14/17.
 */
public class StringComparision {

    static final int NUM_TIMES = 1000000;
    static final String NAME = "sxm.ds.wbmd.data";


    public static void main(String[] args) {
        stringComparison();
        stringComparison2();
        instanceCheck(new SimpleObj());

    }

    public static void stringComparison() {

        long startTime = System.nanoTime();
        SimpleObj simple = new SimpleObj();
        boolean flag = false;

        for (int i = 0; i < NUM_TIMES; i++) {

            switch (simple.getName()) {
                case NAME:
                    flag = true;
                    break;
            }

        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("String comparision Duration: " + duration);

    }

    public static void stringComparison2() {

        long startTime = System.nanoTime();
        SimpleObj simple = new SimpleObj();
        boolean flag = false;

        for (int i = 0; i < NUM_TIMES; i++) {
            if (simple.getName().equals(NAME)) {
                flag = true;
            }

        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("String comparision 2 Duration: " + duration);

    }


    public static void instanceCheck(Object simple) {

        long startTime = System.nanoTime();
        boolean flag = false;

        for (int i = 0; i < NUM_TIMES; i++) {
            if (simple instanceof SimpleObj) {
                flag = true;
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("Instance check Duration: " + duration);
    }


    public static class SimpleObj {


        public String getName() {
            return "sxm.ds.wbmd.data";
        }
    }


}
