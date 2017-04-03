package ctci.Chapter2;

/**
 * Created by fkruege on 4/1/17.
 */
public class SumLists2_5 {

    public int sumLists(Node n1, Node n2) {
        int int1 = getIntFromList(n1);
        int int2 = getIntFromList(n2);
        return int1 + int2;
    }

    private int getIntFromList(Node n1) {
        StringBuilder sb = new StringBuilder();
        while (n1 != null) {
            sb.insert(0, n1.value);
            n1 = n1.next;
        }
        if(sb.length() > 0){
            return Integer.parseInt(sb.toString());
        }

        return 0;
    }
}
