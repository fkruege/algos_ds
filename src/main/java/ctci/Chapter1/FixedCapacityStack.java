package ctci.Chapter1;

public class FixedCapacityStack<Item> {

    private Item[] a; // stack entries
    private int N; // size

    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        a[N++] = item;
    }

    public Item pop() {
        return a[--N];
    }

    public static void main(String[] args){
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<Integer>(5);
        stack.push(5);

    }
}
