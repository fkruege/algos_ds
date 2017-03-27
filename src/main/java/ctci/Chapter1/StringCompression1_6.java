package ctci.Chapter1;

/**
 * Created by fkruege on 3/25/17.
 */
public class StringCompression1_6 {


    public String compress(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        if (charArray.length >= 1) {
            compressIt(sb, charArray, charArray[0], 1, 1);
            if (sb.length() < s.length()) {
                return sb.toString();
            }
        }

        return s;
    }

    private void compressIt(StringBuilder sb, char[] charArray, char previous, int index, int compressCount) {

        if (index >= charArray.length) {
            sb.append(previous);
            sb.append(compressCount);
            return;
        }

        char current = charArray[index];
        if (previous == current) {
            compressCount++;
            compressIt(sb, charArray, current, ++index, compressCount);
        } else {
            sb.append(previous);
            sb.append(compressCount);
            compressIt(sb, charArray, current, ++index, 1);
        }
    }

}
