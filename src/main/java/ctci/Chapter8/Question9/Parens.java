package ctci.Chapter8.Question9;

import com.sun.org.apache.xpath.internal.operations.Bool;
import edu.princeton.cs.algs4.Stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by fkruege on 5/30/17.
 */
public class Parens {

    public Set<String> generateParens(int numberParens) {
        Set<String> results = new HashSet<>();
        generate("", true, numberParens - 1, numberParens, results);
        return results;
    }

    private void generate(String current, boolean next, int openLeft, int closedLeft, Set<String> results) {

        if (next && openLeft < 0) {
            return;
        }

        if (!next && closedLeft < 0) {
            return;
        }

        if (!next && closedLeft < openLeft) {
            return;
        }

        current = next ? current + "(" : current + ")";

        if (openLeft == 0 && closedLeft == 0) {
            results.add(current);
            return;
        }

        generate(current, true, openLeft - 1, closedLeft, results);
        generate(current, false, openLeft, closedLeft - 1, results);

    }

}
