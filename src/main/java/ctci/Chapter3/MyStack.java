package ctci.Chapter3;

/**
 * Created by fkruege on 4/2/17.
 */
public class MyStack<K> {

    private int size = 0;
    private MyNode<K> head = null;

    public MyStack() {

    }

    public void push(K item) {
        MyNode<K> temp = head;
        MyNode<K> node = new MyNode<K>(item);

        head = node;
        node.next = temp;
        size++;
    }

    public K pop() {
        if (size <= 0) {
            throw new IndexOutOfBoundsException();
        }

        MyNode<K> temp = head;
        head = head.next;

        temp.next = null;

        size--;

        return temp.value;
    }

    public K peek() {
        if (size <= 0) {
            return null;
        }

        return head.value;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public int size(){
        return size;
    }


    private static class MyNode<K> {
        K value;
        MyNode<K> next;

        MyNode(K value) {
            this.value = value;
        }
    }
}
