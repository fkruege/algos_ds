package interviews;

/**
 * Created by fkruege on 4/21/17.
 */
public class LongestCommonSubsequence {

    public String findLCS(String string1, String string2) {

        // do null checks

        int maxLCSLength = 0;
        String small;
        String bigger;

        if (string1.length() >= string2.length()) {
            maxLCSLength = string2.length();
            small = string2;
            bigger = string1;
        } else {
            maxLCSLength = string1.length();
            small = string1;
            bigger = string2;
        }


        for (int i = 0; maxLCSLength - i > 0; i++) {
            int lcsLength = maxLCSLength - i;
            for (int j = 0; j + lcsLength <= small.length(); j++) {
                String lcs = small.substring(j, j + lcsLength);
                if (bigger.contains(lcs)) {
                    return lcs;
                }
            }
        }

        return "";

    }
}
