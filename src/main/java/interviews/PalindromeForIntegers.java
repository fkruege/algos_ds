package interviews;

/**
 * Created by fkruege on 7/22/17.
 */
public class PalindromeForIntegers {

    // 333 * 333 = 110889 -> 11 or 88
    // 111 * 111 = 12321 -> 12321
    int largestPalindrome(int a, int b) {
        int product = a * b;
        String asString = Integer.toString(product);
        for (int i = asString.length(); i >= 2; i--) {
            String largestPalindrome = findLargestPalindrome(asString, i);
            if (largestPalindrome.length() > 0) {
                return Integer.valueOf(largestPalindrome);
            }
        }

        return -1;
    }

    private String findLargestPalindrome(String product, int length) {
        for (int i = 0; i + length <= product.length(); i++) {
            String asString = product.substring(i, i + length);
            int midpoint = (length) / 2;
            String prefix = asString.substring(0, midpoint);
            String suffix = "";

            if (asString.length() % 2 == 0) {
                // even length
                suffix = asString.substring(midpoint, asString.length());
            } else {
                // odd length
                StringBuilder sb = new StringBuilder(asString.substring(midpoint + 1, asString.length()));
                suffix = sb.reverse().toString();
            }
            if (prefix.equals(suffix)) {
                return asString.substring(i, length);
            }
        }

        return "";
    }

}
