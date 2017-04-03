package ctci.Chapter2;

/**
 * Created by fkruege on 4/1/17.
 */
public class Palindrome2_6_StringBuilder {

    public boolean isPalindrome(Node node) {

        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.value);
            node = node.next;
        }

        int length = sb.length();
        boolean evenLength = length % 2 == 0;
        int midPoint = length / 2;
        String part1 = sb.substring(0, midPoint);
        String part2 = sb.reverse().substring(0, midPoint);
        return part1.equals(part2);

    }


}
