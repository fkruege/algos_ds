package sorting;

/**
 * Created by fkruege on 3/7/17.
 */
public class HexUtil {
    public String stringToHex(String string) {
        char[] chars = string.toCharArray();
        StringBuilder hexString = new StringBuilder();
        for (char c : chars) {
            hexString.append(Integer.toHexString((int) c));
        }
        return hexString.toString();
    }

    public String hexToString(int[] intHexArray) {
        //increment by two since the hex is split by two positions
        StringBuilder check = new StringBuilder();
        for (int hex : intHexArray) {
            String hexString = Integer.toString(hex);
            check.append(hexString);
        }
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < check.toString().toCharArray().length - 1; i += 2) {
            String test = check.toString().substring(i, (i + 2));
            int decimal = Integer.parseInt(test, 16);
            string.append((char) decimal);
        }
        return string.toString();
    }
}
