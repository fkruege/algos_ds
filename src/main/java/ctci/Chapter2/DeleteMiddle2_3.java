package ctci.Chapter2;

/**
 * Created by fkruege on 3/31/17.
 */
public class DeleteMiddle2_3 {

    public void deleteMiddle(Node node) {
        if (node == null) {
            return;
        }

        Node previousMiddle = null;
        Node middle = node;
        Node lookAhead = node;

        int middleCount = 0;
        int lookAheadCount = 0;

        while (lookAhead.next != null) {
            lookAhead = lookAhead.next;
            lookAheadCount++;

            if (lookAheadCount > 1) {
                if (lookAheadCount / 2 > middleCount) {
                    previousMiddle = middle;
                    middle = middle.next;
                    middleCount++;
                }
            }
        }

        if (lookAheadCount >= 2) {
            previousMiddle.next = middle.next;
            middle.next = null;
        }
    }
}
