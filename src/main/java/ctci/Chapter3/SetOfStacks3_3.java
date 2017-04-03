package ctci.Chapter3;

import java.util.EmptyStackException;

/**
 * Created by fkruege on 4/2/17.
 */
public class SetOfStacks3_3<K> {

    MyStack<MyStack<K>> stackSet;
    MyStack<K> currentStack;
    private int maxCapacity = 0;
    private int size = 0;

    public SetOfStacks3_3(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        stackSet = new MyStack<MyStack<K>>();
        currentStack = new MyStack<K>();
    }

    public void push(K item) {
        if (currentStack.size() > maxCapacity) {
            stackSet.push(currentStack);
            currentStack = new MyStack<K>();
        }

        currentStack.push(item);
        size++;
    }

    public K pop() {
        if (currentStack.isEmpty()) {
            if (stackSet.isEmpty()) {
                throw new EmptyStackException();
            } else {
                currentStack = stackSet.pop();
                size--;
                return currentStack.pop();
            }
        } else {
            size--;
            return currentStack.pop();
        }
    }


}
