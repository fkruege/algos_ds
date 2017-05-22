package ctci.Chapter5;

/**
 * Created by fkruege on 5/7/17.
 */
public class FractionToBinary5_2 {

    public String getBinaryRepresentation(double value) {

        StringBuilder sb = new StringBuilder();
        sb.append(".");
        while (value > 0) {

            int bit = (int) (value * 2);
            if (bit >= 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }

            value = (value * 10) - ((int) (value * 10));
        }

        return sb.toString();


    }
}
