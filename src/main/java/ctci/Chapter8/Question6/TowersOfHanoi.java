package ctci.Chapter8.Question6;

import edu.princeton.cs.algs4.Stack;

import java.util.ArrayList;
import java.util.List;

public class TowersOfHanoi {


    public int solve(Stack<Integer> tower1, Stack<Integer> tower2, Stack<Integer> tower3) {
        List<Stack<Integer>> towers = new ArrayList<>();
        towers.add(tower1);
        towers.add(tower2);
        towers.add(tower3);
        return solveTowers(towers);
    }


    private int solveTowers(List<Stack<Integer>> towers) {
        int count = 0;
        if (isSolved(towers)) {
            return 0;
        }

        Stack<Integer> smallest = findSmallest(towers);
        moveSmallestRight(smallest, towers);
        count++;

        if (isSolved(towers)) {
            return 1;
        }

        Stack<Integer> secondSmallest = find2ndSmallest(towers);
        if(secondSmallest.size() > 0){
            count++;
            moveSmallestRight(secondSmallest, towers);
        }

        return solveTowers(towers) + count;
    }

    private boolean isSolved(List<Stack<Integer>> towers) {
        for (int i = 0; i < towers.size() - 1; i++) {
            if (!towers.get(i).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private void moveSmallestRight(Stack<Integer> src, List<Stack<Integer>> towers) {

        int srcIndex = 0;
        for (int i = 0; i < towers.size(); i++) {
            if (src == towers.get(i)) {
                srcIndex = i;
                break;
            }
        }

        Stack<Integer> nextTower = towers.get((srcIndex + 1) % 3);
        Stack<Integer> nextNextTower = towers.get((srcIndex + 2) % 3);

        if (isMoveValid(src, nextTower)) {
            move(src, nextTower);
            return;
        }

        if (isMoveValid(src, nextNextTower)) {
            move(src, nextNextTower);
            return;
        }

    }


    private Stack<Integer> findSmallest(List<Stack<Integer>> towers) {
        Integer disc1 = towers.get(0).size() == 0 ? Integer.MAX_VALUE : towers.get(0).peek();
        Integer disc2 = towers.get(1).size() == 0 ? Integer.MAX_VALUE : towers.get(1).peek();
        Integer disc3 = towers.get(2).size() == 0 ? Integer.MAX_VALUE : towers.get(2).peek();

        if (disc1 < disc2 && disc1 < disc3) {
            return towers.get(0);
        }

        if (disc2 < disc1 && disc2 < disc3) {
            return towers.get(1);
        }
        return towers.get(2);
    }

    private Stack<Integer> find2ndSmallest(List<Stack<Integer>> towers) {
        Integer disc1 = towers.get(0).size() == 0 ? Integer.MAX_VALUE : towers.get(0).peek();
        Integer disc2 = towers.get(1).size() == 0 ? Integer.MAX_VALUE : towers.get(1).peek();
        Integer disc3 = towers.get(2).size() == 0 ? Integer.MAX_VALUE : towers.get(2).peek();

        if (isMiddle(disc1, disc2, disc3)) {
            return towers.get(0);
        }

        if (isMiddle(disc2, disc1, disc3)) {
            return towers.get(1);
        }

        return towers.get(2);
    }

    private boolean isMiddle(Integer main, Integer other1, Integer other2) {
        if (main > other1 && main < other2) {
            return true;
        }
        if (main < other1 && main > other2) {
            return true;
        }
        return false;
    }


    private boolean isMoveValid(Stack<Integer> src, Stack<Integer> dest) {
        if (src.size() == 0) {
            return false;
        }

        Integer topOfSrc = src.peek();

        if (dest.size() == 0) {
            return true;
        }

        Integer topOfDest = dest.peek();
        if (topOfSrc < topOfDest) {
            return true;
        }
        return false;
    }

    private void move(Stack<Integer> src, Stack<Integer> dest) {
        Integer topOfSrc = src.pop();
        dest.push(topOfSrc);
    }

}
