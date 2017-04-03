package ctci.Chapter3;

import java.util.EmptyStackException;

/**
 * Created by fkruege on 4/2/17.
 */
public class SortStack3_5 {

    private MyStack<Integer> tempStack;
    private MyStack<Integer> sortedStack;

    public SortStack3_5() {
        tempStack = new MyStack<Integer>();
        sortedStack = new MyStack<Integer>();
    }

    public void push(Integer item) {

        if (sortedStack.isEmpty()) {
            sortedStack.push(item);
        } else if (sortedStack.peek() >= item) {
            sortedStack.push(item);
        } else {
            while (!sortedStack.isEmpty() && item >= sortedStack.peek()) {
                tempStack.push(sortedStack.pop());
            }

            sortedStack.push(item);
            while (!tempStack.isEmpty()) {
                sortedStack.push(tempStack.pop());
            }
        }

    }

    public Integer pop(){
        return sortedStack.pop();
    }

    public Integer peek(){
        return sortedStack.peek();
    }

    public boolean isEmpty(){
        return sortedStack.isEmpty();
    }


}
